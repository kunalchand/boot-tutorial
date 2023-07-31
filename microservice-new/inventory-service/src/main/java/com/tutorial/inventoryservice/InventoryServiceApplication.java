package com.tutorial.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tutorial.inventoryservice.model.Inventory;
import com.tutorial.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_15_pro");
			inventory1.setQuantity(100);

			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("iphone_16_red");
			inventory2.setQuantity(0);

			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
		};
	}
}
