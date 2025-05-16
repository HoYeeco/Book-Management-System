package github.hoyeeco.bookmanagementsystem.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Integer id;
    private String number;
    private List<Product> productList;
}
