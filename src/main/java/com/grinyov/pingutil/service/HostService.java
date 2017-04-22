package com.grinyov.pingutil.service;

import com.grinyov.pingutil.dao.model.Host;

import java.util.List;

/**
 * Created by vgrinyov.
 */
public interface HostService {

    List<Host> findAll();

    String echo(String host, int port, int timeout);

}
