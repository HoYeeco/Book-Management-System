package github.hoyeeco.bookmanagementsystem.service;

import  github.hoyeeco.bookmanagementsystem.pojo.User;

import java.util.List;

public interface UserService {
    User findUserById(Integer id);
    User findUserByOrder(Integer id);
    List<User> findAllUsers();
}
