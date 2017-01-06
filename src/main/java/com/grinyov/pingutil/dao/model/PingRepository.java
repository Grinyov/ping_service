package com.grinyov.pingutil.dao.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by grinyov
 */
public interface PingRepository extends JpaRepository<Ping, Long>{
    List<Ping> findByPingAddress(String address);
}
