package com.example.FarmMonitoringWeb.domain;

import lombok.Data;

@Data
public class User {

    private String id;
    private String name;
    private String password;
    private String farm_id;
    private String email;
    private String phone;
    private String plant1;
    private String plant2;
    private String plant3;

}
