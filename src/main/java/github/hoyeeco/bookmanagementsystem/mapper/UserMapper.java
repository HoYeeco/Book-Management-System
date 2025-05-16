package github.hoyeeco.bookmanagementsystem.mapper;

import github.hoyeeco.bookmanagementsystem.pojo.User;

import java.util.List;

public interface UserMapper   {
    User findUserById(Integer id);
    User findUserByOrder(Integer id);
    List<User> findAllUsers();
}
