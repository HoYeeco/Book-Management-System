package github.hoyeeco.bookmanagementsystem.mapper;

import github.hoyeeco.bookmanagementsystem.pojo.Product;

public interface ProductMapper {
    Product findProductByOrderId(Integer id);
}
