package com.grinyov.pingutil.dao;

import com.grinyov.pingutil.dao.model.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vgrinyov
 */
@Repository
public interface PingRepository extends JpaRepository<Host, Long>{
    //List<Host> findByPingAddress(String address);
}
