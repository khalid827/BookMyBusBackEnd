package com.example.velocity.easybus.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.example.velocity.easybus.exception.ResourceNotFoundException;
import com.example.velocity.easybus.model.Bus;
import com.example.velocity.easybus.repository.BusRepository;


@SpringBootTest
@RunWith(SpringRunner.class)
class BusControllerTest {
	
	@InjectMocks
	 BusController busController;
	
	@Mock
	BusRepository brepo;
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSaveBus()  throws ParseException {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		
		//Bus bus = new Bus("abc101",501, "Mumbai", "Delhi", "20:05", "00:05", "2022-07-15", "Normal",
		//		"8372833292", 150,5);
		
       Bus b=new Bus();
       b.setId("M123");
       b.setBusNo(309);
       b.setArrivalLocation("Mumbai");
       b.setBusType("AC");
       b.setDate("2022-07-08");
       b.setArrivalTime("20:06");
       b.setDepartureLocation("Delhi");
       b.setDepartureTime("20:00");
       b.setDriverContact("6786786789");
       b.setPrice(100);
       b.setSeatsAvailable(40);
       b.hashCode();
       b.equals(b);
     b.toString();
		when(brepo.save(any(Bus.class))).thenReturn(b);

		String response = busController.saveBus(b);

		assertEquals("bus saved successfully", response);
	}

	@Test
	public void testGetAllBuses() throws ParseException{
		when(brepo.findAll()).thenReturn(Stream.of(
				new Bus("abc101",501, "Mumbai", "Delhi", "20:05", "00:05", "2022-07-15", "Normal",
						"8372833292", 150,5),
				new Bus("abc101",501, "Mumbai", "Delhi", "20:05", "00:05", "2022-07-15", "Normal",
						"8372833292", 150,5))
				.collect(Collectors.toList()));
		assertEquals(2, busController.getAllBuses().size());
	}

/*	@Test
	void testUpdateBus() {
		fail("Not yet implemented");
	}*/

	@Test
	void testGetBusById() throws ParseException, ResourceNotFoundException{
		
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		
		Optional<Bus> bus = Optional.of(new Bus("abc101",501, "Mumbai", "Delhi", "20:05", "00:05", "2022-07-15", "Normal",
				"8372833292", 150,5));
		
		//brepo.save(bus);
		
		when(brepo.findById("abc101")).thenReturn(bus);
		
		//Optional<Bus> bus1=<Optional>(busController.getBusById("abc101")
		
		
		assertEquals(bus, busController.getBusById("abc101"));
				
	}

	@Test
	void testGetBusbyBusNo() {
		
		List<Bus> bus = List.of(new Bus("abc101",501, "Mumbai", "Delhi", "20:05", "00:05", "2022-07-15", "Normal",
				"8372833292", 150,5));
		
		//brepo.save(bus);
		
		when(brepo.findBybusNo(501)).thenReturn(bus);
		
		//Optional<Bus> bus1=<Optional>(busController.getBusById("abc101")
		
		
		assertEquals(bus, busController. getBusbyBusNo(501));
		
		

		
		
		
	}

	@Test
	void testGetBusbylocation() {
		List<Bus> bus = List.of(new Bus("abc101",501, "Mumbai", "Delhi", "20:05", "00:05", "2022-07-15", "Normal",
				"8372833292", 150,5));
		
		//brepo.save(bus);
		
		when(brepo.findBylocation("Mumbai", "Delhu","2022-07-15")).thenReturn(bus);
		
		//Optional<Bus> bus1=<Optional>(busController.getBusById("abc101")
		
		
		assertEquals(bus, busController. getBusbylocation("Mumbai", "Delhu","2022-07-15"));
	}

	@Test
	void testDeleteBus() throws ResourceNotFoundException {
		
		Optional<Bus> bus = Optional.of(new Bus("abc101",501, "Mumbai", "Delhi", "20:05", "00:05", "2022-07-15", "Normal",
				"8372833292", 150,5));
		Optional<Bus> bus1 = Optional.of(new Bus("abc102",501, "Mumbai", "Delhi", "20:05", "00:05", "2022-07-15", "Normal",
				"8372833292", 150,5));
		
		
	
		brepo.deleteById("abc101");
		Map<String,Boolean> response=new HashMap<>();
		response.put("Delete the Bus",Boolean.TRUE);
		
		assertEquals(response, busController.deleteBus("62d122ce22846e1dc4fae12a"));
		//assertThat(brepo.existsById("62c4143ff1c24474fbf39f09")).isFalse();
	}

}