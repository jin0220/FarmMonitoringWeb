package com.example.FarmMonitoringWeb.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Member {

    @Id
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
