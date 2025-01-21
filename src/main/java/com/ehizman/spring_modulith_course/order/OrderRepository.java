package com.ehizman.spring_modulith_course.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    Optional<Order> getOrderByOrderIdentifier(String orderIdentifier);
}
