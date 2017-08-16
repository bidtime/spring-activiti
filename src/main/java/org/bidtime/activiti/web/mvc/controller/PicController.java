package org.bidtime.activiti.web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PicController {
@RequestMapping(value="/authImg")
public String getpic(){
	return "authImg";
}
}
