package github.hoyeeco.bookmanagementsystem.pojo;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private IdCard card; //关联的证件
    private List<Order> orderList;//用户关联的订单
}
