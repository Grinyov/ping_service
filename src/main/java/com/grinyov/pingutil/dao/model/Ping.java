package com.grinyov.pingutil.dao.model;

import lombok.Data;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by grinyov
 */
@Data
public class Ping {

    private Long id;
    private String address;
    private String time;

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
