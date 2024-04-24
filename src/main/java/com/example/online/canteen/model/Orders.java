package com.example.online.canteen.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;

import java.util.Date;

@Entity
@Table(
        name = "orders",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"user_name"}),
                @UniqueConstraint(columnNames = {"Product_name"}),
                @UniqueConstraint(columnNames = {"total_price"}),
                @UniqueConstraint(columnNames = {"email"})
        }
)
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    private String user_name;

    private String Product_name;
    private int total_products;

    private float total_price;
    private String email;
    private String status;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public int getTotal_products() {
        return total_products;
    }

    public void setTotal_products(int total_products) {
        this.total_products = total_products;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
