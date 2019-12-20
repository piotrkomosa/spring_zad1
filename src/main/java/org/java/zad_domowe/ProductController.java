package org.java.zad_domowe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

     List<Product> products;

     ProductRepository productRepository;

    @GetMapping("/")
    public String add(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        model.addAttribute("products",products);
        return "home";
    }
        @PostMapping("/lista")
        public String findAll(List<Product> products) {
        return "lista";
    }
}
