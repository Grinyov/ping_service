package com.grinyov.pingutil.service;

import com.google.common.collect.ImmutableList;
import com.grinyov.pingutil.dao.model.Ping;
import com.grinyov.pingutil.dao.PingRepository;
import com.grinyov.pingutil.service.PingService;
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

     private static List<Ping> pings = new ArrayList<>();

     static{
         pings.add(new Ping("localhost"));
         pings.add(new Ping("ya.ru"));
         pings.add(new Ping("mail.ru"));
         pings.add(new Ping("google.com"));

     }


    @PostConstruct
    public void init() {
        pingRepository.save(pings);
    }


    @Override
    public List<Ping> findAll() {
        return pingRepository.findAll().stream()
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
    }

}
