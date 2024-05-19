package com.api.CRUD.services;

import com.api.CRUD.models.UserModel;
import com.api.CRUD.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired //Inyección de dependencias
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll(); //El método findAll viene de JpaRepository
    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }


}
