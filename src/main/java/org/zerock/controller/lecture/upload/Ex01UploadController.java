package org.zerock.controller.lecture.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/upload")
@Log4j
public class Ex01UploadController {
	
	@RequestMapping("/sub01")
	public void method1(String fname) {
		log.info(fname);
	}
}
