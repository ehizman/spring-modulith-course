package com.ehizman.spring_modulith_course.order;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderInventoryRepository extends CrudRepository<OrderInventory, Long> {
    @Query(value = "SELECT SUM('oi.total_qty_price FROM order_inventory oi WHERE oi.order_id = ?1", nativeQuery = true)
    long getOrderAmount(Long orderId);
}
