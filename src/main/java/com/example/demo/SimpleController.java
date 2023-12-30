package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    List<ComputerBrand> computerBrands = List.of(
            new ComputerBrand(1L, "Apple"),
            new ComputerBrand(2L, "Dell"),
            new ComputerBrand(3L, "HP"),
            new ComputerBrand(4L, "Lenovo"),
            new ComputerBrand(5L, "Microsoft"),
            new ComputerBrand(6L, "Samsung"),
            new ComputerBrand(7L, "Sony"),
            new ComputerBrand(8L, "Toshiba"));

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("computerBrands", computerBrands);
        return "index";
    }
}
