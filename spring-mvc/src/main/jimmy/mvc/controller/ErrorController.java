package jimmy.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/error")
public class ErrorController {

	/**
	 * 模拟500内部错误
	 * 
	 * @param rq
	 * @throws Exception
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void index(HttpServletRequest rq) throws Exception {
		throw new Exception("尚未实现...");
	}

}
