package github.hoyeeco.bookmanagementsystem.controller;

import github.hoyeeco.bookmanagementsystem.pojo.User;
import github.hoyeeco.bookmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findUbyid")//一对一：根据id查找用户
    public String findUserById(Integer id, Model model) {
        User user = userService.findUserById(id);
        System.out.println("User的信息为：" + user);
        model.addAttribute("msg", "User信息查询成功！");
        return "public/success";
    }

    @GetMapping("/findUbyO")//一对多：根据订单查找用户
    public String findUserByOrder(Integer id, Model model) {
        User user = userService.findUserByOrder(id);
        System.out.println("具有订单信息的User信息为：" + user);
        model.addAttribute("msg", "具有订单信息的User信息查询成功！");
        return "public/success";
    }

    @GetMapping("/findall")
    public String findAllUsers(Model model) {
        List<User> users = userService.findAllUsers();
        for (User user : users)
            System.out.println("全部User的信息为："+user);
        model.addAttribute("msg", "全部User信息查询成功！");
        return "public/success";
    }
}
