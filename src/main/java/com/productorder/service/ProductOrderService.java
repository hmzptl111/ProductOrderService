package com.productorder.service;

import com.productorder.bean.Order;

public interface ProductOrderService {
	boolean saveOrder(Order order);
	
	Order getOrderById(long id);
}
