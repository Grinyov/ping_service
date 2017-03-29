package com.grinyov.pingutil.service;

import com.google.common.collect.ImmutableList;
import com.grinyov.pingutil.dao.model.Host;
import com.grinyov.pingutil.dao.HostRepository;
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
public class HostServiceImpl implements HostService {

    @Autowired
    private HostRepository hostRepository;

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
        hostRepository.save(hosts);
    }


    @Override
    public List<Host> findAll() {
        return hostRepository.findAll().stream()
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
    }

    public String getDelay(String host){


         return "dummy";
    }
}
