package com.codemz.com.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}

	@GetMapping(value = "/cursohtmlcss")
	public String curso01() {
		return "cursohtmlcss";
	}

	@GetMapping(value = "/cursojava")
	public String curso02() {
		return "cursojava";
	}

	@GetMapping(value = "/cursospring")
	public String curso03() {
		return "cursospring";
	}

	@GetMapping(value = "/index")
	public String index01() {
		return "index";
	}

}
