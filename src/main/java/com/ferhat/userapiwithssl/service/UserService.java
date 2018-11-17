package com.ferhat.userapiwithssl.service;


import com.ferhat.userapiwithssl.entity.User;
import com.ferhat.userapiwithssl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createNewUser() {
        User newUser = new User();
        newUser.setUserFirstName("FirstName");
        newUser.setUserLastName("LastName");
        registerUserToDatabase(newUser);
        return newUser;
    }

    private void registerUserToDatabase(User newUser) {
        userRepository.save(newUser);
    }
}
