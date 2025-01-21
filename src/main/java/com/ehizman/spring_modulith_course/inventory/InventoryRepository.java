package com.ehizman.spring_modulith_course.inventory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Ehis Edemakhiota
 * @code @created: Jan 3, 2025
 */

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {
    Optional<Inventory> getInventoryByName(String name);
    List<Inventory> getInventoryByNameIn(List<String> names);
}
