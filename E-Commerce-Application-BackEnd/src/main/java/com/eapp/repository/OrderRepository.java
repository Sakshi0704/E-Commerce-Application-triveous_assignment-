package com.eapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eapp.model.Orders;


@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
