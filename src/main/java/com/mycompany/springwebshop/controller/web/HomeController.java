/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.controller.web;

import com.mycompany.springwebshop.entity.ProductEntity;
import com.mycompany.springwebshop.entity.ShopEntity;
import com.mycompany.springwebshop.service.OwnerShopService;
import com.mycompany.springwebshop.service.ProductService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class HomeController {
    @Autowired
    private ProductService productService;
    
    @Autowired
    private OwnerShopService shopService;
    
    @RequestMapping(value = "/Trangchu", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("Home");
        mav.addObject("productList", productService.getProducts());
        mav.addObject("shopList",shopService.getShops());
        return mav;
    }

    @RequestMapping(value = "/Trangchu/Product/{id}", method = RequestMethod.GET)
    public ModelAndView detailPage(Model model,@PathVariable(value="id") long id) {
        ModelAndView mav = new ModelAndView("Detail");
        return mav;
    }
//
//    @RequestMapping(value = "/Trangchu", method = RequestMethod.GET)
//    public ModelAndView homePage() {
//        ModelAndView mav = new ModelAndView("home");
//        return mav;
//    }
//
//    @RequestMapping(value = "/Trangchu", method = RequestMethod.GET)
//    public ModelAndView homePage() {
//        ModelAndView mav = new ModelAndView("home");
//        return mav;
//    }
//
//    @RequestMapping(value = "/Trangchu", method = RequestMethod.GET)
//    public ModelAndView homePage() {
//        ModelAndView mav = new ModelAndView("home");
//        return mav;
//    }
//
//    @RequestMapping(value = "/Trangchu", method = RequestMethod.GET)
//    public ModelAndView homePage() {
//        ModelAndView mav = new ModelAndView("home");
//        return mav;
//    }

}
