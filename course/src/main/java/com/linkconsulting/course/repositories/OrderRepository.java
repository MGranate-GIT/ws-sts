package com.linkconsulting.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkconsulting.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
