package com.sample.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sample.spring.dto.User;
import com.sample.spring.service.UserService;

@Controller
@RequestMapping("/home")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView performLogin(@RequestParam("name") String name,@RequestParam("password") String password) 
	{
		System.out.println(name);
		ModelAndView model = new ModelAndView();
		if (name == null || name.isEmpty() || password == null 
				|| password.isEmpty()) {
			model.setViewName("Login");
			
		}
		User user = userService.performLogin(name, password);
		if (user!=null) {
			return new ModelAndView("redirect:/home/userlist", "user", user);
		} else {
			model.setViewName("Login");			
			return model;
		}

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String goToRegister() {
		return "Register";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String inserData(@ModelAttribute User user) {
		if (user != null)
			userService.insertData(user);
		System.out.println("hai register called");
		return "redirect:/home/userlist";
	}

	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public ModelAndView getUserList() {
		List<User> userList = userService.getUserList();
		return new ModelAndView("userList", "userList", userList);
	}

	@RequestMapping(value = "/updte", method = RequestMethod.GET)
	public String Update() {
		return "ForgotPassword";
	}

	@RequestMapping("/update")
	public String updateUser(@ModelAttribute User user) {
		userService.update(user);
		return "redirect:/home/userlist";
	}

	@RequestMapping("/delete")
	public String deleteUser(@RequestParam String id) {
		System.out.println("id = " + id);
		userService.deleteData(id);
		return "redirect:/home/userlist";
	}

	@RequestMapping(value = "/updatepage", method = RequestMethod.GET)
	public String goToupdate() {
		System.out.println("Update service has been called!");
		return "UpdatePage";
	}

	
	@RequestMapping(value = "/updatedata", method = RequestMethod.POST)
	public String updateUserData(@ModelAttribute User user) {
		System.out.println(user.getUserid());
		System.out.println("Entered data"+user.toString());
		userService.updateData(user);
		return "redirect:/home/userlist";

	}
	
	
	@RequestMapping(value="/performselect",method=RequestMethod.GET)
	public ModelAndView performSelect(@RequestParam("id") int userid) {
		System.out.println("id = " + userid);
		User user = userService.performSelect(userid);
			System.out.println(user.getName());
			return new ModelAndView("UpdatePage", "user", user);
		
	}

}
