package com.example.online.canteen.model;

import jakarta.persistence.Entity;

@Entity
public class User {
    private int reg_no;
    private String user_name;
    private int mobile_number;
    private String email_id;
    private String password;

}
