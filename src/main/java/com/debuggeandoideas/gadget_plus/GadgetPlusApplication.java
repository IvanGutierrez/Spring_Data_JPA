package com.debuggeandoideas.gadget_plus;

import com.debuggeandoideas.gadget_plus.entities.BillEntity;
import com.debuggeandoideas.gadget_plus.entities.OrderEntity;
import com.debuggeandoideas.gadget_plus.entities.ProductEntity;
import com.debuggeandoideas.gadget_plus.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class GadgetPlusApplication implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private BillRepository billRepository;
	@Autowired
	private ProductCatalogRepository productCatalogRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(GadgetPlusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		final var HOME = this.categoryRepository.findById(1L).orElseThrow();
//		final var OFFICE = this.categoryRepository.findById(2L).orElseThrow();

//		this.productCatalogRepository.findAll().forEach(product ->{
//			if (product.getDescription().contains("home")){
//				product.addCategory(HOME);
//			}
//			if (product.getDescription().contains("office")){
//				product.addCategory(OFFICE);
//			}
//			this.productCatalogRepository.save(product);
//		});

		var random = new Random();
//		System.out.println(random.nextInt(16));//Me da opcion a 16 no. aleatorios 0-15
//		System.out.println(random.nextInt(16)+1);//No aleatorios entre 1 y 16
		var orderRandom = random.nextInt(16)+1;
		var productsCatalog = new LinkedList<>(this.productCatalogRepository.findAll());
		IntStream.range(0, productsCatalog.size()).forEach(i->{

		});
	}
}
