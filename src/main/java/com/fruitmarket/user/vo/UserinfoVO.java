package com.fruitmarket.user.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserinfoVO {
    private String userId;
    private String password;
    private String userRole;
    private int balance;
}
