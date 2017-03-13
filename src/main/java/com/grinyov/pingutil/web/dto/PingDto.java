package com.grinyov.pingutil.web.dto;


import java.net.InetAddress;

/**
 * Created by vgrinyov.
 */
public class PingDto{
    private long id;
    private String address;
    private String timeResponce;

    public PingDto(InetAddress address){
        this.address = address.toString();
    }
}
