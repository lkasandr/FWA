package edu.school.cinema.services;

import edu.school.cinema.models.User;

public interface UsersService {
    void saveUser(User user);
    void findUser(String email, String password);
}
