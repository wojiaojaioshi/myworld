package com.example.bigwork.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class worker {
    private String workerid;
    private String workername;
    private String identityid;
    private String phone;
    private String departmentid;
    private String post;
    private String hasloginid;

    private String loginid;
    private String password;
}
