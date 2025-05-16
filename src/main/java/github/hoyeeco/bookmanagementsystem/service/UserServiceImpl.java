package github.hoyeeco.bookmanagementsystem.service;

import github.hoyeeco.bookmanagementsystem.mapper.UserMapper;
import github.hoyeeco.bookmanagementsystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public User findUserByOrder(Integer id) {
        return userMapper.findUserByOrder(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }
}