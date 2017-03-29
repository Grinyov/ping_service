package com.grinyov.pingutil.web;

import com.grinyov.pingutil.dao.model.Host;
import com.grinyov.pingutil.dao.PingRepository;
import com.grinyov.pingutil.service.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vgrinyov
 */
@RestController
@RequestMapping(value = "/api")
public class PingRestController {

    @Autowired
    private PingService pingService;
    @Autowired
    private PingRepository pingRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Host> getPingList(){
        return pingService.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Host> create(@RequestBody Host host){
        pingRepository.save(host);
        return pingRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Host> delete(@PathVariable long id){
        pingRepository.delete(id);
        return pingRepository.findAll();
    }
}
