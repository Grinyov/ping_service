package com.grinyov.pingutil.service;

import com.google.common.collect.ImmutableList;
import com.grinyov.pingutil.dao.model.Host;
import com.grinyov.pingutil.dao.PingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

/**
 * Created by vgrinyov.
 */
@Service
public class PingServiceImpl implements PingService {

    @Autowired
    private PingRepository pingRepository;

     private static long countDbObjects;

     private static List<Host> hosts = new ArrayList<>();

     static{
         hosts.add(new Host("localhost"));
         hosts.add(new Host("ya.ru"));
         hosts.add(new Host("mail.ru"));
         hosts.add(new Host("google.com"));

     }


    @PostConstruct
    public void init() {
        pingRepository.save(hosts);
    }


    @Override
    public List<Host> findAll() {
        return pingRepository.findAll().stream()
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
    }

    public String getDelay(String host){


         return "dummy";
    }
}
