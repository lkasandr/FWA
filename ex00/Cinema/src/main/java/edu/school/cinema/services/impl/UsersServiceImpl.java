package edu.school.cinema.services.impl;

import edu.school.cinema.models.User;
import edu.school.cinema.repositories.UsersRepository;
import edu.school.cinema.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void findUser(String email, String password) {

    }
}
