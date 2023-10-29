package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/buyConfirmation")
    public String purchaseConfirmation(@RequestParam("productID") Long theId, Model theModel) {

        boolean success = false;

        Product theProduct;

        if (productRepository.findById(theId).isPresent()) {
            theProduct = productRepository.findById(theId).get();
        }
        else return "confirmationbuyfailure";

        if (!(theProduct.getInv() <= 0)) {
            theProduct.setInv(theProduct.getInv() - 1);
            productService.save(theProduct);
            success = true;
        }

        theModel.addAttribute("product", theProduct);

        System.out.println("id: " + theProduct.getId());

        if (success) {
            return "confirmationbuysuccess";
        }
        else return "confirmationbuyfailure";
    }
}
