package com.grinyov.pingutil.config;

import com.grinyov.pingutil.dao.HostRepository;
import com.grinyov.pingutil.dao.model.Host;
import com.grinyov.pingutil.service.HostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

/**
 *  * This is an initializing bean that insert hosts
 *  in the DB if collection is empty.
 *
 * Created by grinyov
 */
@Component
public class DataInitializer implements CommandLineRunner{

    private final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

    private HostRepository hostRepository;

    @Autowired
    public DataInitializer(HostRepository hostRepository){
        this.hostRepository = hostRepository;
    }

    /**
     * Fill hosts collection if it is empty.
     *
     */
    @Override
    public void run(String... strings) throws Exception {
        List<Host> hosts = new ArrayList<>();

        hosts.add(new Host("localhost"));
        hosts.add(new Host("ya.ru"));
        hosts.add(new Host("mail.ru"));
        hosts.add(new Host("google.com"));

        hostRepository.save(hosts);

//        if(hostRepository.findAll().size() == 0) {
//            logger.info("host collection is empty, filling it with hosts.");
//            hostRepository.save(hosts);
//        }
    }


}
