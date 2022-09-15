package com.productorder.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productorder.bean.OrderItem;

@Repository
public interface ProductOrderDao extends JpaRepository<OrderItem, Long> {

}
