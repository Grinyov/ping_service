package com.grinyov.pingutil.service;

import com.grinyov.pingutil.dao.model.Ping;

import java.util.List;

/**
 * Created by vgrinyov.
 */
public interface PingService {

    List<Ping> findAll();

}
