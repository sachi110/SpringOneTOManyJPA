package com.repo;

import com.Model.OrderData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<OrderData,Integer> {


}
