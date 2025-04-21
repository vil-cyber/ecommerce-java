package com.jsp.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.ecommerce.dto.UserDto;
import com.jsp.ecommerce.service.AdminService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;

	@GetMapping("/register")
	public String loadRegister(UserDto userDto, Model model) {
		return adminService.register(userDto,model);
	}

	@PostMapping("/register")
	public String register(@Valid UserDto userDto, BindingResult result) {
		return adminService.register(userDto,result);
	}

}
