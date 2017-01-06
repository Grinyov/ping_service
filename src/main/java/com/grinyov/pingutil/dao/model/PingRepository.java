package com.grinyov.pingutil.dao.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by grinyov
 */
public interface PingRepository extends CrudRepository<Ping, Long>{
    List<Ping> findByPingAddress(String address);
}
