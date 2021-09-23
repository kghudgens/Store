package com.shop.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Controls the view 
@Controller
public class HomeController {
    // Get request mapping, accepts the url path
    @GetMapping("/")
    public String home() {
        // Return the name of the html wanted
        return "index";
    }
}
