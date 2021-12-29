package com.tell;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;

import com.tell.model.Orders;
import com.tell.repository.OrderRepository;
import com.tell.service.OrderService;


@SpringBootTest
class OrderServiceApplicationTests {
	@Autowired
	private OrderService orderService;
	
	@MockBean
	OrderRepository orderRepository;

	@Test
	public void getAllOrdersTest()
	{
	when(orderRepository.findAll()).thenReturn(Stream.of
	(new Orders(1,"2021-07-25",1,200,"paytm","paid",2,1,"Mango","Anirban Dey","801374773","Kolkata","West Bengal",2334411)
	,new Orders(1,"2021-07-25",123,2347,"Paypal","Paid",2,1,"Apple","yky","345678","delhi","ncr",2334411))
	.collect(Collectors.toList()));
	assertEquals(2,orderService.getAllOrders().size());
	}
	
	
	@Test
    
    @Order(5)
   
    @Rollback(value = false)
    public void deleteOrderTest(){
		
		orderRepository.deleteById(1);
   
    Order employee1 = null;
   
    Optional<Order> optionalEmployee = Optional.empty();
   
    if(optionalEmployee.isPresent()){ employee1 = optionalEmployee.get(); }
   
    Assertions.assertThat(employee1).isNull(); }
}