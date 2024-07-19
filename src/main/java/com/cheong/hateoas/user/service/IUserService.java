package com.cheong.hateoas.user.service;

import com.cheong.hateoas.user.domain.User;
import com.cheong.hateoas.user.dto.UserDTO;
import com.cheong.hateoas.user.dto.UserInput;
import org.springframework.data.domain.Page;

public interface IUserService {

    User findById(Long id);

    void save(UserInput userInput);

    void update(Long id, UserInput userInput);

    void deleteById(Long id);

    Page<User> findAll();
}
