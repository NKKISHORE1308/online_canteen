package com.example.online.canteen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Category {
    @Id
    @Column(unique = true)
    public String  category_id;
    public String category_description;
    @NotNull
    public String category_name;


}
