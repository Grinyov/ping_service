package com.grinyov.pingutil.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by grinyov
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String showHello() {
        return "index";
    }
}
