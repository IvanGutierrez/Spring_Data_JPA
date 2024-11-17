package com.debuggeandoideas.gadget_plus;

import com.debuggeandoideas.gadget_plus.repositories.BillRepository;
import com.debuggeandoideas.gadget_plus.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GadgetPlusApplication implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private BillRepository billRepository;

	public static void main(String[] args) {
		SpringApplication.run(GadgetPlusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.orderRepository.findAll().forEach(System.out::println);
//		this.billRepository.findAll().forEach(bill -> System.out.println(bill.toString()));
	}
}
