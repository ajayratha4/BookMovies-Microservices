package com.user.user.services;

import com.user.user.advice.NoRecordFoundException;
import com.user.user.entites.User;
import com.user.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public User signIn(User user) {

        User findUser = userRepository.findOneByuserIdAndEmail(user.getUserId(), user.getEmail());
        if (findUser == null) {
            throw new NoRecordFoundException("No Record Found");
        }
        return findUser;

    }
}
