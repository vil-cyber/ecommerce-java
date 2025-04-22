package com.jsp.ecommerce.service;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.jsp.ecommerce.dto.UserDto;

import jakarta.servlet.http.HttpSession;

public interface AdminService {

	String register(UserDto userDto, Model model);

	String sumbitOtp(int otp, HttpSession session);
	String register(UserDto userDto, BindingResult result, HttpSession session);

}
