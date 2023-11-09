package com.eapp.service;

import org.springframework.stereotype.Service;

import com.eapp.model.Cart;
import com.eapp.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	
	private CartRepository cartRepository;

	@Override
	public Cart addProductToCartSpecificUser(Integer productId, Integer quantity, String email) {
		
		
		
		
		return null;
	}

	@Override
	public Cart deleteProductToCartOfSpecificUser(Integer productId, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart retriveAllProductsOfCartOfSpecificUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart updateQuantityFormCartSpecificUser(String email, Integer quentity) {
		// TODO Auto-generated method stub
		return null;
	}

}
