package com.cheong.hateoas.user.service;

import com.cheong.hateoas.subscription.domain.Subscription;
import com.cheong.hateoas.user.domain.User;
import com.cheong.hateoas.user.dto.UserDTO;
import com.cheong.hateoas.user.dto.UserInput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Override
    public Page<User> findAll() {
        List<User> users = List.of(new User(1L,"as", new Subscription()));
        return new PageImpl<>(users);
    }

    public User findById(Long id) {
        Subscription subscription = new Subscription();
        User user = new User(id, "Hi", subscription);
        subscription.setName("Hi");
        return user;
    }

    public void save(UserInput userInput){
        //Perform save operation
    }

    public void update(Long id, UserInput userInput){

    }

    public void deleteById(Long id){

    }

}
