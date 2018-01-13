package com.store.inventory.InventoryService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
}

class MainCommand implements CommandLineRunner{

	@Override
	public void run(String... strings) throws Exception {

	}
}

@RestController
@RequestMapping("/inventory")
class CatalogService{

	@GetMapping("/getCatalogs")
	public  String getCatalogData(){
		return "{data:catalogs}";
	}
}
