package com.grinyov.pingutil.web;

import com.grinyov.pingutil.dao.model.Host;
import com.grinyov.pingutil.dao.HostRepository;
import com.grinyov.pingutil.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vgrinyov
 */
@RestController
@RequestMapping(value = "/api")
public class HostRestController {

    @Autowired
    private HostService hostService;
    @Autowired
    private HostRepository hostRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Host> getPingList(){
        return hostService.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Host> create(@RequestBody Host host){
        hostRepository.save(host);
        return hostRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Host> delete(@PathVariable long id){
        hostRepository.delete(id);
        return hostRepository.findAll();
    }
}
