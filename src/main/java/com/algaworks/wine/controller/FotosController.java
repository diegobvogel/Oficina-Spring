package com.algaworks.wine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fotos")
public class FotosController {
	
	@RequestMapping(method = RequestMethod.POST)
	public String upload(@RequestParam("files[]") MultipartFile[] files){
		System.out.println(files[0].getOriginalFilename());
		return "OK";
	}
	
}
