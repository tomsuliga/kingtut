package org.suliga.kingtut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KingTutMainController {
	// @GetMapping ==  @RequestMapping(method = RequestMethod.GET)
	@GetMapping({ "/", "/index", "/home" })
	public String index(Model model) { // Model = interface, ModelMap = class
		model.addAttribute("applicationName", "King Tut");
		return "index";
	}
}
