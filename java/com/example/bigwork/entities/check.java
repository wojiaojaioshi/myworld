package com.example.bigwork.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class check {
    private String checkid;
    private String registerid;
    private String checktime;
    private String checkpay;
    private String checkproduct;
    private String blood;

    private String username;//联表
}
