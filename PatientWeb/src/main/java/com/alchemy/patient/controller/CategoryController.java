package com.alchemy.patient.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alchemy.patient.model.Category;

import com.alchemy.patient.service.CategoryService;


@RestController
@RequestMapping("/category")
public class CategoryController
{
	@Autowired
	private CategoryService  categoryService;
	
	@PostMapping("/save")
	public ResponseEntity saveUser(@RequestBody Category category) 
	{
		System.out.println(category);
		Category newCategory = categoryService.saveUser(category);	
		/* if(newPatient==null)
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);		
		else */
			return ResponseEntity.ok(newCategory);
	}
	
	@GetMapping("/load")
	public ResponseEntity loadUsers() 
	{
		List<Category> list =  categoryService.loadUsers();
		return ResponseEntity.ok(list);
	}
}
