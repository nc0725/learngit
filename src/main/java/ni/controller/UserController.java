package ni.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response){
		
		
		
	}
	
}
