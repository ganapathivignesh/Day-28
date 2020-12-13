package com.src;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String display(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "viewpage";
	}
	@RequestMapping("/error")
	@ExceptionHandler({SpringException.class})
	public String submitForm(@ModelAttribute("emp")Employee e,ModelMap m) throws SpringException
	{ 
		if(e.getName().length()<=5)
		{
			throw new SpringException("name is short");
		}
		else
		{
		    m.addAttribute("name", e.getName());
		}
		
		if(e.getPass().length()<8)
		{
			throw new SpringException("password minimum be 8 character");
		}
		else
		{
			m.addAttribute("pass",e.getPass());
		}
		if(e.getDesignation()!=null)
		{
			throw new SpringException("required");
		}
		else
		{
			m.addAttribute("designation",e.getDesignation());
		}
		
		if(e.getEmail().contains("$"))
		{
			throw new SpringException("enter correct email id");
		}
		else
		{
			m.addAttribute("email",e.getEmail());
		}
		
		if(e.getGender()!=null)
		{
			throw new SpringException("required");
		}
		else
		{
			m.addAttribute("gender",e.getGender());
		}
		
		m.addAttribute("mblno",e.getMblno());
		
		return "final";
	}
}
