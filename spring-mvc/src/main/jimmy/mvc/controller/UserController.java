package jimmy.mvc.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import jimmy.mvc.dto.User;
import jimmy.mvc.enums.DEGREE;
import jimmy.mvc.enums.HOBBY;
import jimmy.mvc.enums.SEX;
import jimmy.mvc.utils.EnumRepository;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping(value = "/add", method = { RequestMethod.GET })
	public String add(HttpServletRequest request, Model model) {
		User user = new User();

		// 初始化属性值
		user.setIsVip(false);
		user.setNetworkAge(3);
		Calendar calendar = Calendar.getInstance();
		calendar.set(1985, 5, 1);
		user.setBirthday(calendar.getTime());
		user.setSex(SEX.Male);
		List<String> hobbies = new ArrayList<String>();
		hobbies.add(HOBBY.Music.getValue());
		hobbies.add(HOBBY.Sports.getValue());
		user.setHobbies(hobbies);
		user.setDegree(DEGREE.Master);

		model.addAttribute("userModel", user);

		// 页面上radiobuttons,checkboxes,select的items数据源
		model.addAttribute("sexMap", EnumRepository.getSexMap());
		model.addAttribute("hobbyMap", EnumRepository.getHobbyMap());
		model.addAttribute("degreeMap", EnumRepository.getDegreeMap());

		return "form/form-sample";
	}

	@RequestMapping(value = "/show", method = { RequestMethod.POST })
	public String show(HttpServletRequest request, Model model, User user) {

		// 因为add/show这二个action，我们共用了一个页面，所以下面这三个集合，必须手动再添加一次，否则UI界面上，items数据源为null，页面报错
		model.addAttribute("sexMap", EnumRepository.getSexMap());
		model.addAttribute("hobbyMap", EnumRepository.getHobbyMap());
		model.addAttribute("degreeMap", EnumRepository.getDegreeMap());
		model.addAttribute("userModel", user);
		
		return "form/form-sample";
	}

}
