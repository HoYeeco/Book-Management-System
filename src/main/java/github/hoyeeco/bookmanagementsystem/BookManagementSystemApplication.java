package github.hoyeeco.bookmanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(basePackages = "github.hoyeeco.bookmanagementsystem.*")

@SpringBootApplication
@MapperScan("github.hoyeeco.bookmanagementsystem.mapper")
public class  BookManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookManagementSystemApplication.class, args);
    }
}