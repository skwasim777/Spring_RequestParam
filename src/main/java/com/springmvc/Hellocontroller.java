package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hellocontroller {
	@RequestMapping("/hello")
	// read the provided from data
	public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m) {
		if (pass.equals("admin")) {
			String msg = "Hello" + name;
			// add a massage to the model
			m.addAttribute("massage", msg);
			return "viewpage";
		}
		else {
			String msg = "Sorry"+name+",You Entered incorrect password";
			m.addAttribute("massage",msg);
				return "errorpage";
		}
	}
}
