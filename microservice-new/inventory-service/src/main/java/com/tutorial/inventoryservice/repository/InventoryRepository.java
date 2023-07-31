package com.tutorial.inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.tutorial.inventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(@Param("skuCode") String skuCode);
}
