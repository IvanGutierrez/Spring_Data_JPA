package com.debuggeandoideas.gadget_plus;

import com.debuggeandoideas.gadget_plus.entities.BillEntity;
import com.debuggeandoideas.gadget_plus.entities.OrderEntity;
import com.debuggeandoideas.gadget_plus.entities.ProductEntity;
import com.debuggeandoideas.gadget_plus.repositories.BillRepository;
import com.debuggeandoideas.gadget_plus.repositories.OrderRepository;
import com.debuggeandoideas.gadget_plus.repositories.ProductCatalogRepository;
import com.debuggeandoideas.gadget_plus.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

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

	public static void main(String[] args) {
		SpringApplication.run(GadgetPlusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		var order = this.orderRepository.findById(2L).orElseThrow();
		this.productCatalogRepository.findAll().forEach(p -> System.out.println(p));
//		var product1 = ProductEntity.builder().quantity(BigInteger.ONE).build();
//		var product2 = ProductEntity.builder().quantity(BigInteger.TWO).build();
//		var product3 = ProductEntity.builder().quantity(BigInteger.TEN).build();

//		var products = List.of(product1, product2, product3);

//		order.setProduct(products);

//		products.forEach(producto -> producto.setOrder(order));
//		order.getProduct().remove(0);

//		this.orderRepository.save(order);
	}
}
