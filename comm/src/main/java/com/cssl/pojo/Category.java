package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Category {
    private int cid;
    private String cname;
    private int parentId;
}
