package com.example.controllers.api;



import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.validation.BindingResult;

import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;





import com.example.controllers.api.form.UserRegisterForm;

import com.example.model.entities.User;

import com.example.model.services.UserService;



@RestController

@RequestMapping("practice/Kougawa")

public class ApiKougawaController {



	@Autowired

	private UserService userService;

	

	// step 1-2 Getでクエリパラメータを受け取って、二乗をかえす

	@RequestMapping(path = "/step1_2", method = RequestMethod.GET)

	public ResponseEntity<?> step1_2(@RequestParam("i1") int i1) {

		return ResponseEntity.ok(String.valueOf(i1 * i1));

	}



}