package com.estudo.curso.services;

import com.estudo.curso.entitites.Order;
import com.estudo.curso.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        return optionalOrder.get();
    }
}
