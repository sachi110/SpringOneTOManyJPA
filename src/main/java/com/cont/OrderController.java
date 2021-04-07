package com.cont;


import com.Model.OrderData;
import com.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.Integer;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @RequestMapping(value="/create",method = RequestMethod.POST)
    public OrderData createOdrer(@RequestBody OrderData orderData) {

        return orderRepo.save(orderData);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<OrderData> getOderDetails(@PathVariable Integer id) {

         return orderRepo.findById(id);
}


}
