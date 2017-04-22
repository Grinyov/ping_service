package com.grinyov.pingutil.service;

import com.google.common.collect.ImmutableList;
import com.grinyov.pingutil.dao.model.Host;
import com.grinyov.pingutil.dao.HostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.net.InetAddress;
import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

/**
 * Created by vgrinyov.
 */
@Service
public class HostServiceImpl implements HostService {

    private final Logger logger = LoggerFactory.getLogger(HostServiceImpl.class);

    @Autowired
    private HostRepository hostRepository;

    @Override
    public List<Host> findAll() {

        logger.debug("getHosts()");

        List<Host> hosts = hostRepository.findAll();

        logger.debug("Returning list of {} hosts from database", hosts.size());

        return hosts.stream()
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
    }

    @Override
    public String echo(String host) {

        try{
            InetAddress address = InetAddress.getByName(host);
            long timer = -System.currentTimeMillis();
            boolean reachable = address.isReachable(10000);
            timer += System.currentTimeMillis();
            return " " + timer;
        } catch (Exception e){
            return "unreachable"; // Either timeout or unreachable or failed DNS lookup.
        }
    }
}
