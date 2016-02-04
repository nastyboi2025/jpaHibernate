package com.naser.hello.feb;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Query;
import java.util.List;


@Entity @Data
public class Cust {

    @Id
    private int    userId;
    private String firstName;
    private String surName;
    private String address;

}
