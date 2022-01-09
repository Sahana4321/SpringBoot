package com.alchemy.patient.service;

import java.util.List;

import com.alchemy.patient.model.Category;
import com.alchemy.patient.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Service
public class CategoryService 
{
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category saveUser(Category category) 
	{
		try {
			categoryRepository.insert(category);		
			return category;
		}catch(Exception ex) {
			return null;
		}
	}
	
	
	public List<Category>  loadUsers() 
	{
		try {
			List<Category> list =  categoryRepository.findAll();
			return list;
		}catch(Exception ex) {
			return null;
		}
	}
}
