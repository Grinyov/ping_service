package com.grinyov.pingutil.web;

import com.grinyov.pingutil.dao.model.Host;
import com.grinyov.pingutil.dao.HostRepository;
import com.grinyov.pingutil.service.HostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vgrinyov
 */
@RestController
@RequestMapping(value = "/api")
public class HostRestController {

    private final Logger logger = LoggerFactory.getLogger(HostRestController.class);

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

    @RequestMapping(value = "/echo/{host:.+}", method = RequestMethod.GET)
    public String echo(@PathVariable String host){
        String delay;
        delay = "" + hostService.echo(host);
        return delay;
    }
}
