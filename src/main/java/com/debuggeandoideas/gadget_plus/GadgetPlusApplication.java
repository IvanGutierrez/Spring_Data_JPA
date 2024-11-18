package com.debuggeandoideas.gadget_plus;

import com.debuggeandoideas.gadget_plus.entities.BillEntity;
import com.debuggeandoideas.gadget_plus.entities.OrderEntity;
import com.debuggeandoideas.gadget_plus.repositories.BillRepository;
import com.debuggeandoideas.gadget_plus.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
		/*this.orderRepository.findAll().forEach(System.out::println);
		this.billRepository.findAll().forEach(bill -> System.out.println(bill.toString()));

		var bill = BillEntity.builder()
				.rfc("AABA850513")
				.totalAmount(BigDecimal.TEN)
				.id("b-17")
				.build();

//		this.billRepository.save(bill);

		var order = OrderEntity.builder()
				.createdAt(LocalDateTime.now())
				.clientName("Donald Trump")
				.bill(bill)
				.build();

		this.orderRepository.save(order);*/

		var order = this.orderRepository.findById(17L).get();
		System.out.println("PRE-PERSIST: " + order.getClientName());
		order.setClientName("Barack Obama");
		order.getBill().setRfc("XXXX000000");
		this.orderRepository.save(order);

		var order2 = this.orderRepository.findById(17L).get();
		System.out.println("POST-PERSIST: " + order2.getClientName());
	}
}
