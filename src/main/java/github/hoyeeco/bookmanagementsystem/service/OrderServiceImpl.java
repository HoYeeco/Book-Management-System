package github.hoyeeco.bookmanagementsystem.service;

import github.hoyeeco.bookmanagementsystem.mapper.OrderMapper;
import github.hoyeeco.bookmanagementsystem.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Order findOrderByProduct(Integer id) {
        return orderMapper.findOrderByProduct(id);
    }
}
