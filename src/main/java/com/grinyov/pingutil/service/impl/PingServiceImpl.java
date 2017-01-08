package com.grinyov.pingutil.service.impl;

import com.grinyov.pingutil.dao.model.Ping;
import com.grinyov.pingutil.dao.model.PingRepository;
import com.grinyov.pingutil.service.PingService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by vgrinyov.
 */
@Component
public class PingServiceImpl implements PingService {

    private PingRepository pingRepository;

    @Override
    public List<Ping> findAll() {
        return pingRepository.findAll();
    }
}
