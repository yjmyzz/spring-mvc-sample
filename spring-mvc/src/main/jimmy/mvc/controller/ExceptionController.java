package jimmy.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import jimmy.mvc.exception.BusinessException;
import jimmy.mvc.exception.ParameterException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/exception")
public class ExceptionController extends BaseController {

	@RequestMapping(value = "/index/{expType}", method = RequestMethod.GET)
	public void index(HttpServletRequest rq, @PathVariable String expType)
			throws Exception {
		if (expType.equals("business")) {
			throw new BusinessException("0010-业务处理异常");
		} else if (expType.equals("parameter")) {
			throw new ParameterException("1010-参数处理异常");
		} else {
			throw new Exception("9999-其它处理异常");
		}
	}

}
