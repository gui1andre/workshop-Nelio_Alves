package com.gui1andre.workshop.services;

import com.gui1andre.workshop.entities.Product;
import com.gui1andre.workshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return  productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> user = productRepository.findById(id);
        return user.get();
    }
}
