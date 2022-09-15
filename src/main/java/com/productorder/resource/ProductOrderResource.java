package com.productorder.resource;

import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productorder.bean.Order;

@RestController
@RequestMapping("/orders")
public class ProductOrderResource {
	@PostMapping(path = "")
	public URL saveOrder(@RequestBody Order order) {
		return null;
	}
	
	@GetMapping(path = "/{id}")
	public Order findOrderById(@PathVariable("id") long id) {
		return null;
	}
}