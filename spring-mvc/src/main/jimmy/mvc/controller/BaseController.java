package jimmy.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import jimmy.mvc.exception.BusinessException;
import jimmy.mvc.exception.ParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

	@ExceptionHandler
	public String exp(HttpServletRequest request, Exception ex) {

		request.setAttribute("ex", ex);

		// 根据不同错误转向不同页面
		if (ex instanceof BusinessException) {
			return "exception/business-exception";
		} else if (ex instanceof ParameterException) {
			return "exception/parameter-exception";
		} else {
			return "exception/general-exception";
		}
	}
}
