package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.dto.OrderRequest;
import com.nt.dto.OrderResponse;
import com.nt.notification.NotificationUtil;
import com.nt.service.OrderService;

@SpringBootTest
@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.nt.*")
class SpringBootRestDataApplicationTests {
	
	/*  @InjectMocks
	  private OrderService service;
	  
	  @Before
	  public void init() {
		   MockitoAnnotations.initMocks(NotificationUtil.class);
	  }
	  
	  @Test
	  public void teststaticMethod() {
		  //given
		  String email="test@test.com";
		  PowerMockito.mockStatic(NotificationUtil.class);
		  //when
		  when(NotificationUtil.sendEmail(email)).thenReturn("success");
		  //then
		  OrderRequest request=new OrderRequest(101, "milk",2, 20, "test@test.com",true);
		  OrderResponse response=service.checkoutOrder(request);
		  assertEquals("sucess", response.getMessage());
	  }*/
}
