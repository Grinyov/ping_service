package com.grinyov.pingutil.web;

import com.grinyov.pingutil.dao.model.Ping;
import com.grinyov.pingutil.dao.model.PingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by grinyov
 */
@RestController
@RequestMapping(value = "/api")
public class PingController {

    @Autowired
    private PingRepository pingRepository;


    @RequestMapping(value = "/list")
    public List<Ping> getPingList(){
        return pingRepository.findAll();
    }
}
