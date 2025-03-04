package com.gui1andre.workshop.services;

import com.gui1andre.workshop.entities.Category;
import com.gui1andre.workshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return  categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> user = categoryRepository.findById(id);
        return user.get();
    }
}
