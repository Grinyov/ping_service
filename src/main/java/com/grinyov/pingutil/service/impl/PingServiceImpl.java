package com.grinyov.pingutil.service.impl;

import com.grinyov.pingutil.dao.model.Ping;
import com.grinyov.pingutil.dao.model.PingRepository;
import com.grinyov.pingutil.service.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vgrinyov.
 */
@Service
public class PingServiceImpl implements PingService {

    @Autowired
    private PingRepository pingRepository;

     private static List<Ping> pings = new ArrayList<>();

     static{
         pings.add(new Ping("localhost", "0"));
         pings.add(new Ping("ya.ru", "0"));
         pings.add(new Ping("mail.ru", "0"));
         pings.add(new Ping("google.com", "0"));

     }


    @PostConstruct
    public void init() {
        pingRepository.save(pings);
    }


    @Override
    public List<Ping> findAll() {
        return pingRepository.findAll();
    }
}
