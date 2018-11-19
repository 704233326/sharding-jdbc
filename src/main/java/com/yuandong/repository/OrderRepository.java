package com.yuandong.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yuandong.model.Order;

/**
 * Created by wuwf on 17/4/19.
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
	
}
