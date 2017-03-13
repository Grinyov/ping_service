package com.grinyov.pingutil.dao.model;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


/**
 * Created by vgrinyov
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "pings")
public class Ping {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String address;



    public Ping(String address) {
        this.address = address;
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
