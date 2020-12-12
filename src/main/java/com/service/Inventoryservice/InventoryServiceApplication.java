package com.service.Inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.service.Inventoryservice.entities.Product;
import com.service.Inventoryservice.entities.ProduitRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean 
	CommandLineRunner start2(ProduitRepository produitdao,  RepositoryRestConfiguration restconfg) {
		restconfg.exposeIdsFor(Product.class); 
		return arg->{
			produitdao.save(new Product(null, "produit1", 5)); 
			produitdao.save(new Product(null, "produit2", 8)); 
			produitdao.save(new Product(null, "produit3", 25)); 
			produitdao.findAll().forEach(p->{
				System.out.println(p.getName()+" "+p.getQ());
			});
		};
		
	}

}
