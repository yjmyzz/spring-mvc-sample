package jimmy.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/log")
public class LogController {

	Logger logger1 = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public ModelAndView index() {
		logger1.debug("debug!!!");
		logger1.info("info!!!");
		logger1.warn("warn!!!");
		logger1.error("error!!!");
		logger1.fatal("fatal!!!");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("log/index");
		return modelAndView;
	}

}
