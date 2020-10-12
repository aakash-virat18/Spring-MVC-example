package com.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showform()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		String name = request.getParameter("studentName");
		
		name=name.toUpperCase();
		
		String result = "Shoutout to -----> "+name;
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDude2(@RequestParam("studentName") String name, Model model)
	{
		
		name=name.toUpperCase();
		
		String result = "Shoutout to -----> "+name;
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}

}
