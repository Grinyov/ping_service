package com.grinyov.pingutil.dao;

import com.grinyov.pingutil.dao.model.Ping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vgrinyov
 */
@Repository
public interface PingRepository extends JpaRepository<Ping, Long>{
    //List<Ping> findByPingAddress(String address);
}