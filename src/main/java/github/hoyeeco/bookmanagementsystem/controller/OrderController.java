package github.hoyeeco.bookmanagementsystem.controller;

import github.hoyeeco.bookmanagementsystem.pojo.Order;
import github.hoyeeco.bookmanagementsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/findObyP")//多对多：根据产品查找订单
    public String findOrderByProduct(Integer id, Model model) {
        Order order = orderService.findOrderByProduct(id);
        System.out.println("订单信息为：" + order);
        model.addAttribute("msg", "订单信息查询成功！");
        return "public/success";
    }
}
