package jimmy.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/upload")
public class UploadController {

	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("upload/upload");
		return modelAndView;
	}

	@RequestMapping(value = "/save", method = { RequestMethod.POST })
	public ModelAndView save(HttpServletRequest request,
			@RequestParam("formParam") String formParam,
			@RequestParam("formFile") MultipartFile formFile)
			throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("formParam", formParam);
		modelAndView.addObject("formFileName", formFile.getOriginalFilename());
		modelAndView.addObject("fileSize", formFile.getSize());
		modelAndView.addObject("contentType", formFile.getContentType());

		// 保存文件
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		String extFileName = formFile.getOriginalFilename().substring(
				formFile.getOriginalFilename().lastIndexOf(".") + 1);
		String savedFileName = sdf.format(dt) + "." + extFileName;

		String realPath = request.getSession().getServletContext()
				.getRealPath("/").concat("resources/upload/" + savedFileName)
				.replace('\\', '/');

		File file = new File(realPath);
		FileOutputStream fs = new FileOutputStream(file);
		fs.write(formFile.getBytes());
		fs.flush();
		fs.close();

		modelAndView.addObject("savedFileName", savedFileName);
		modelAndView.addObject("realPath", realPath);
		modelAndView.addObject("virtualPath", "upload/" + savedFileName);
		modelAndView.setViewName("upload/upload");
		return modelAndView;
	}

}
