package github.hoyeeco.bookmanagementsystem.mapper;

import github.hoyeeco.bookmanagementsystem.pojo.Order;

public interface OrderMapper {
    Order findOrderByProduct(Integer id);
}
