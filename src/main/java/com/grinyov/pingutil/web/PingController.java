package com.grinyov.pingutil.web;

import com.grinyov.pingutil.dao.model.Ping;
import com.grinyov.pingutil.dao.model.PingRepository;
import com.grinyov.pingutil.service.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * Created by vgrinyov
 */
@RestController
@RequestMapping(value = "/api")
public class PingController {

    @Autowired
    private PingService pingService;
    @Autowired
    private PingRepository pingRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Ping> getPingList(){
        return pingService.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Ping> create(@RequestBody Ping ping){
        pingRepository.save(ping);
        return pingRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Ping> delete(@PathVariable long id){
        pingRepository.delete(id);
        return pingRepository.findAll();
    }
}
