package com.eapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eapp.model.Cart;
import com.eapp.model.Users;
import com.eapp.service.CartService;
import com.eapp.service.UsersService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/triv/users")
public class CustomerController {

	@Autowired
	private UsersService usersService;
	
	private CartService cartService;
	
	@PutMapping("/update-user")  // by admin and user both
	public ResponseEntity<Users> updateUserDetailsHandler(@Valid @RequestBody Users user) {
		
		Users updatedAdmin = usersService.updateUserDetails(user);
		
		return new ResponseEntity<>(updatedAdmin,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/addProduct-to-cart/{productId}/{quantity}")
	public ResponseEntity<Cart> addProductToCartSpecificUserHandler(@PathVariable Integer productId,@PathVariable Integer quantity,Authentication auth) {
		
		Users user = usersService.getUserByEmail(auth.getName());
		
		Cart cart = cartService.addProductToCartSpecificUser(productId, quantity, user.getEmail());
		
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
	
	
	
	
	@DeleteMapping("/deleteProduct-from-cart/{productId}")
	public ResponseEntity<Cart> deleteProductToCartOfSpecificUserHandler(@PathVariable Integer productId,Authentication auth) {
		
		Users user = usersService.getUserByEmail(auth.getName());
		
		Cart cart = cartService.deleteProductToCartOfSpecificUser(productId, user.getEmail());
		
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllProducts-from-cart")
	public ResponseEntity<Cart> retriveAllProductsOfCartOfSpecificUserHandler(Authentication auth) {
		
		Users user = usersService.getUserByEmail(auth.getName());
		
		Cart cart = cartService.retriveAllProductsOfCartOfSpecificUser(user.getEmail());
		
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
	
	@PutMapping("/update-quantity-of-product-in-cart/{quantity}")
	public ResponseEntity<Cart>  updateQuantityFormCartSpecificUserHandler(@PathVariable Integer quantity,Authentication auth) {
		
		Users user = usersService.getUserByEmail(auth.getName());
		
		Cart cart = cartService.updateQuantityFormCartSpecificUser(user.getEmail(),quantity);
		
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
}
