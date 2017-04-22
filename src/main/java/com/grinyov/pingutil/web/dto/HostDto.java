package com.grinyov.pingutil.web.dto;


import java.net.InetAddress;

/**
 * Created by vgrinyov.
 */
public class HostDto {
    private long id;
    private String address;
    private String timeResponse;

    public HostDto(InetAddress address){
        this.address = address.toString();
    }
}
