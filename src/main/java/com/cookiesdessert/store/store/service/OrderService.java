package com.cookiesdessert.store.store.service;

import java.util.List;

import com.cookiesdessert.store.store.domain.Order;
import com.cookiesdessert.store.store.domain.Payment;
import com.cookiesdessert.store.store.domain.Shipping;
import com.cookiesdessert.store.store.domain.ShoppingCart;
import com.cookiesdessert.store.store.domain.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
