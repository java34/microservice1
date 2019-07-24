package com.cssl.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Comment {
    private int prid;
    private String userId;
    private Data date;
    private String text;
}
