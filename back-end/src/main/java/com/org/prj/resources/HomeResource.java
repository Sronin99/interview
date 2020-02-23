/**
 * 
 */
package com.org.prj.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeResource {
	
	@GetMapping
	public String home() {
		return "forward:/index.html";
	}

}
