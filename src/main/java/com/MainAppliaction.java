package com;

import com.Model.OrderData;
import com.Model.Product;
import com.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan("com")
public class MainAppliaction implements CommandLineRunner {

@Autowired
    OrderRepo orderRepo;
    public static void main(String[] args)  {
        SpringApplication.run(MainAppliaction.class);
    }

    @Override
    public void run(String... args) throws Exception {
        Product p=new Product("Mobile","4");
        Product p2=new Product("Mobile2","1");
        orderRepo.deleteAll();
        List<Product> ls=new ArrayList<>();
        ls.add(p);
        ls.add(p2);
        OrderData orderData=new OrderData("sachi",ls);
        orderRepo.save(orderData);


    }
}
