package com.grinyov.pingutil.config;

import com.grinyov.pingutil.dao.PingRepository;
import com.grinyov.pingutil.service.PingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *  * This is an initializing bean that, Used in development profile:
 *  1- Insert hosts in the DB IFF the Currencies collection is empty.
 *  2- Insert sample User account test123/Password1 in User collecti
 * Created by grinyov on 29.03.17.
 */
public class DataInitializer {

    @Autowired
    private PingService pingService;

    @Autowired
    private PingRepository pingRepository;

//    @Autowired
//    private MongoTemplate mongoTemplate;

    private final Logger logger = LoggerFactory.getLogger(DataInitializer.class);


    /**
     * Populate currencies collection if it is empty.
     *
     */
    @PostConstruct
    public void init() throws Exception {
        if(pingRepository.findAll().size() == 0) {
            logger.info("host collection is empty, filling it with hosts.");
        }

    }

    /**
     * Populate User collection with a sample data user account test123/Password1.
     *
     */
//    @Bean
//    public RepositoryPopulatorFactoryBean repositoryPopulator() {
//        logger.info("Inserting some initial data");
//
//    }

    /**
     * Clean up after execution by dropping used test db instance.
     *
     * @throws Exception
     */
    @PreDestroy
    void dropTestData() throws Exception {
    }

}
