/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.service;

import com.mycompany.springwebshop.entity.ShopEntity;
import com.mycompany.springwebshop.repository.ShopRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class OwnerShopService {
    @Autowired
    private ShopRepository shopRepository;
    
    public List<ShopEntity> getShops(){
        return (List<ShopEntity>) shopRepository.findAll();
    } 
    
}
