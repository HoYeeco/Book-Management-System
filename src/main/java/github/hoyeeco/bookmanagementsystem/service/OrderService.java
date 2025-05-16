package github.hoyeeco.bookmanagementsystem.service;

import github.hoyeeco.bookmanagementsystem.pojo.Order;

public interface OrderService {
    Order findOrderByProduct(Integer id);
}
