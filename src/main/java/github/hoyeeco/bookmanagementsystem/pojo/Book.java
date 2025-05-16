package github.hoyeeco.bookmanagementsystem.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Book {
    private Integer id;
    private String name;
    private Double price;
    private String category;
    private Integer pnum;
    private String imgurl;
    private String description;
    private String author;
    private Integer sales;
    @DateTimeFormat(pattern= "yyyy-MM-dd")
    private Date time;
    private String ISBN;
    private String press;
}
