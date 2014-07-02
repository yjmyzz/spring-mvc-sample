package jimmy.mvc.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import jimmy.mvc.dto.Person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message",
				"hello，this is the index page of home !");
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/welcome", method = { RequestMethod.GET })
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Welcome to SpringMVC");
		modelAndView.setViewName("simple/welcome");
		return modelAndView;
	}

	@RequestMapping(value = "/ajax", method = { RequestMethod.GET })
	public ModelAndView ajax() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("ajax/ajax-demo");
		return modelAndView;
	}

	@RequestMapping(value = "/person/{name}", method = { RequestMethod.GET })
	public @ResponseBody
	Person showPerson(@PathVariable String name, Integer age) {
		Person p = new Person();
		if (age != null) {
			p.setAge(age);
		} else {
			p.setAge(25);
		}
		p.setFirstName("jimmy");
		if (name == null || name.isEmpty()) {
			p.setLastName("yang");
		} else {
			p.setLastName(name);
		}
		Calendar calendar = Calendar.getInstance();
		calendar.set(1985, 2, 14);
		p.setBirthday(calendar.getTime());
		List<String> friends = new ArrayList<String>();
		friends.add("mike");
		friends.add("john");
		p.setFriends(friends);
		return p;
	}
}