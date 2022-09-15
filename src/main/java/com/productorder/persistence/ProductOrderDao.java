package com.productorder.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productorder.bean.Order;

@Repository
public interface ProductOrderDao extends JpaRepository<Order, Long> {

}
