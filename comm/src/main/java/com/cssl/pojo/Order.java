package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private int oid;
    private String userId;
    private String oname;
    private String oaddress;
    private String otime;
    private String ocost;
    private int sid;
    private String type;
    private String no;

}
