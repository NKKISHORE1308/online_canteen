package com.example.online.canteen.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reg_no;
    private String user_name;
    private int mobile_number;
    private String email_id;
    private String password;

   /* private String feedback;*/

    /*public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }*/

    public ERole getRole() {
        return role;
    }

    public void setRole(ERole role) {
        this.role = role;
    }

    @Enumerated(EnumType.STRING)
    private ERole role;


    public int getReg_no() {
        return reg_no;
    }

    public void setReg_no(int reg_no) {
        this.reg_no = reg_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(int mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String get_Password() {
        return password;
    }

    public void set_Password(String password) {
        this.password = password;
    }


}
