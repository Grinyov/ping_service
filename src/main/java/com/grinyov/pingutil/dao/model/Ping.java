package com.grinyov.pingutil.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


/**
 * Created by vgrinyov
 */
@Data
@NoArgsConstructor
@Entity
public class Ping {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String time;


    public Ping(String address, String time) {
        this.address = address;
        this.time = time;
    }

    //    public static void main(String[] args) throws UnknownHostException, IOException {
//        String ipAddress = "127.0.0.1";
//        InetAddress inet = InetAddress.getByName(ipAddress);
//
//        System.out.println("Sending Ping Request to " + ipAddress);
//        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
//
//        ipAddress = "173.194.32.38";
//        inet = InetAddress.getByName(ipAddress);
//
//        System.out.println("Sending Ping Request to " + ipAddress);
//        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
//    }
}
