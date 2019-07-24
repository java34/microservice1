package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Place {
    private int pid;
    private String userId;
    private String username;
    private String address;
    private String postalCode;
    private String phone;
}
