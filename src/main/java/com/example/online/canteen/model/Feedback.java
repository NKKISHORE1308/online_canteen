package com.example.online.canteen.model;

import jakarta.persistence.Entity;

@Entity
public class Feedback {
    private int feedback_id;
    private String user_name;
    private int reg_no;
    private String email;
    private String feedback;
}
