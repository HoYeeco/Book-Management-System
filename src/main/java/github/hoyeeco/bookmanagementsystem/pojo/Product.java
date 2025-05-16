package github.hoyeeco.bookmanagementsystem.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private Integer id;
    private String name;
    private Double price;
    private List<Order> order;
}
