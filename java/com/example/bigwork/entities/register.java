package com.example.bigwork.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class register {
    private String registerid;
    private String username;
    private String registertime;
    private String registertype;
    private String registerpay;
    private String rdepartmentid;
    private String identityid;
    private String phone;
}
