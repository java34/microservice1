package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private int id;
    private String userID;
    private String password;
    private String email;
    private String status;
}
