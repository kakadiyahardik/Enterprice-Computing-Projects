package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public static String wellcome(){
		System.out.println("okk im call");
		
		return "login";
	}

}