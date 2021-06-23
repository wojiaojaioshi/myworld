package com.example.bigwork.Service.drug;

import com.example.bigwork.entities.drug;

import java.util.List;

public interface druglistService {
    public List<drug> getalldurg();
    public drug getdrugbyname(String drugname);
    public drug getdrugbyid(String drugid);
}
