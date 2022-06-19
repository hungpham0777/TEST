/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.service;

import com.mycompany.springwebshop.entity.ProductEntity;
import com.mycompany.springwebshop.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<ProductEntity> getProducts(){
        return (List<ProductEntity>) productRepository.findAll();
    }
    public ProductEntity getProductByID(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
