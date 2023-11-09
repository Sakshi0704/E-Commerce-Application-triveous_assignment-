package com.eapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eapp.exception.DataNotFoundException;
import com.eapp.model.Orders;

@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public Orders placeOrderFromSepcificUser(Integer cartId, String email)
			throws DataNotFoundException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders getOrderByIdFromSepcificUser(Integer orderId, String email)
			throws DataNotFoundException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> getOrderHistoryOfSepcificUser(String email)
			throws DataNotFoundException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}



}
