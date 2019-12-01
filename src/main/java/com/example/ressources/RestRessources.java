package com.example.ressources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping( value = "/hello")
public class RestRessources {

	@GetMapping
	public String etudiants()
	{
		return "hello world";
	}
}
