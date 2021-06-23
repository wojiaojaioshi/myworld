package com.example.bigwork.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    private String id;
    private String identityid;
    private String phone;
    private String username;
    private String checked;
    private String registerid;
    private String hosped;
    private String maindoctorid;

    private String workername;

}
