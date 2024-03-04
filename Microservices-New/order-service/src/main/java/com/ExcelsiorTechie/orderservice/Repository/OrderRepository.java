package com.ExcelsiorTechie.orderservice.Repository;

import com.ExcelsiorTechie.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order,Long> {

}
