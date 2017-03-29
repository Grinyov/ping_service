package com.grinyov.pingutil.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by grinyov
 */
@Controller
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/")
    public String show() {
        return "index";
    }

    @RequestMapping("/pings")
    public String pings(){return "pinglist";}
}
