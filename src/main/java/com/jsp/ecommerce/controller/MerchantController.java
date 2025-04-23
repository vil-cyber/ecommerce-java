package com.jsp.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.ecommerce.dto.UserDto;
import com.jsp.ecommerce.service.MerchantService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/merchant")
public class MerchantController {

	@Autowired
	MerchantService merchantService;

	@GetMapping("/register")
	public String loadRegister(UserDto userDto, Model model) {
		return merchantService.register(userDto, model);
	}

	@PostMapping("/register")
	public String register(@Valid UserDto userDto, BindingResult result, HttpSession session) {
		return merchantService.register(userDto, result, session);
	}
	@GetMapping("/otp")
 	public String loadOtp() {
 		return "merchant-otp.html";
 	}
 
 	@PostMapping("/otp")
 	public String submitOtp(@RequestParam("otp") int otp, HttpSession session) {
 		return merchantService.sumbitOtp(otp, session);
 	}
 
 	@GetMapping("/home")
 	public String loadHome() {
 		return "merchant-home.html";
 	}

}
