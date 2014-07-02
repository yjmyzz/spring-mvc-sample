package jimmy.mvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({ "/login" })
public class LoginController {

	/**
	 * 显示登录页
	 * 
	 * @param rq
	 * @return
	 */
	@RequestMapping(value = { "/login" }, method = { RequestMethod.GET })
	public ModelAndView login(HttpServletRequest rq) {
		ModelAndView modelAndView = new ModelAndView();
		// 仅出于演示目的，只要在cookie中找到userId,且仅不为空，就表示已经登录过了
		Cookie[] cookies = rq.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("userId")) {
				String userId = c.getValue();
				if (userId != null && !userId.isEmpty()) {
					modelAndView.setViewName("login/success");
					return modelAndView;
				}
			}
		}
		modelAndView.setViewName("login/login");
		return modelAndView;
	}

	/**
	 * 退出处理
	 * 
	 * @param rq
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = { "/logout" }, method = { RequestMethod.GET })
	public String logout(HttpServletRequest rq, HttpServletResponse resp) {
		Cookie cookie = new Cookie("userId", null);
		cookie.setMaxAge(-1);
		resp.addCookie(cookie);

		return "redirect:login";
	}

	/**
	 * 校验用户名/密码合法性
	 * 
	 * @param rq
	 * @param resp
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = { "/validate" }, method = { RequestMethod.POST })
	public String handleRequest(HttpServletRequest rq,
			HttpServletResponse resp, Model model) throws Exception {
		String _userId = rq.getParameter("userId");
		String _userPassword = rq.getParameter("userPassword");

		// 仅出于演示目的：只要用户名不为空，密码为123456，就验证通过，实际应用中，可改成查询db验证
		if ((!_userId.isEmpty()) && (_userPassword.equals("123456"))) {
			// 这里仅出于演示：将userId放入Cookie，实际应用中，这类敏感信息至少得"撒盐&加密"处理
			resp.addCookie(new Cookie("userId", _userId));
			return "redirect:login";
		}
		return "login/error";
	}
}