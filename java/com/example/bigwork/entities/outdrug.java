package com.example.bigwork.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class outdrug {
    private String outdrugid;
    private String registerid;
    private String drugnum;
    private String drugprice;
    private String drugcause;
    private String drugid;

    public String drugname;//drug表
}
