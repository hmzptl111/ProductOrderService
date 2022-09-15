package com.productorder.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "item")
public class OrderItem {
	@Id
	private long id;
    private long productId;
    private int quantity;
    private double productPrice;
}