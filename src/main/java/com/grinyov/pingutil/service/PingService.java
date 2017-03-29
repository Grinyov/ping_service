package com.grinyov.pingutil.service;

import com.grinyov.pingutil.dao.model.Host;

import java.util.List;

/**
 * Created by vgrinyov.
 */
public interface PingService {

    List<Host> findAll();

}
