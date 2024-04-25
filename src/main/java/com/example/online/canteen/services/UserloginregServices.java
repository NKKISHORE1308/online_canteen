package com.example.online.canteen.services;

import com.example.online.canteen.model.ERole;
import com.example.online.canteen.model.User;
import com.example.online.canteen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserloginregServices {
    @Autowired
    private UserRepository repo;

    public String addUser(User user) {
        // Create a new User object with the provided details
//        User user = new User();
//        user.setUser_name(username);
//        user.setMobile_number(mobilenumber);
//        user.setEmail_id(email);
//        user.set_Password(password);
        user.setRole(ERole.USER);
        // Save the user using the UserRepository
        UserRepository.save(user);

        return "User added successfully";
    }


    public void getUser(String Email,String Password){

    }






}
