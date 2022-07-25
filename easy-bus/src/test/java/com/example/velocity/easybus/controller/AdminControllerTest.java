package com.example.velocity.easybus.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.velocity.easybus.model.Booking;
import com.example.velocity.easybus.model.Bus;
import com.example.velocity.easybus.model.Guest;
import com.example.velocity.easybus.model.User;
import com.example.velocity.easybus.repository.BookingRepository;
import com.example.velocity.easybus.repository.GuestBookingRepository;
import com.example.velocity.easybus.repository.UserRepository;


@SpringBootTest
@RunWith(SpringRunner.class)
class AdminControllerTest {

	@InjectMocks
	AdminController admincontroller;
	
	@Mock
	GuestBookingRepository grepo;
	
	@Mock
	BookingRepository bookrepo;
	
	@Mock
	UserRepository urepo;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	

	@Test
	void testGetProfit() {
		Booking b1=new Booking("M123", "Mahi", 10, 100, 1000, 0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null);
		Guest  g=new Guest("M124", "M", 5, 100, null, 500, null, 500, 0, 0, 0, null, null, null, null, null, null, null, null);
		double profit=b1.getTotalCost()+g.getTotalCost();
		
	assertEquals(Double.valueOf(1500),profit);
		  
		}
	

/*	@Test
	void testInactive() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:9090/bus/revenue/inactive";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals(true, result.getBody().contains(""));
	}*/
	
	@Test
	void testInactive() {
		List<User> allUsers = urepo.findAll();
		List<User> inactive = new ArrayList();
		for(User u:allUsers) {
			int count = bookrepo.findBookingCountOfUser(u.getEmail());
			
			if(count==0)
				inactive.add(u);
		}
		
		List<User> inactive1=admincontroller.inactive();
		assertEquals(inactive, inactive1);
		
	}
	}


