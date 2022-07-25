package com.example.velocity.easybus.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.example.velocity.easybus.exception.ResourceNotFoundException;
import com.example.velocity.easybus.model.Booking;
import com.example.velocity.easybus.model.Bus;
import com.example.velocity.easybus.model.Guest;
import com.example.velocity.easybus.repository.BusRepository;
import com.example.velocity.easybus.repository.GuestBookingRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
class GuestBookingControllerTest {
	

	@InjectMocks
	GuestBookingController guestbookingcontroller;
	
	@Mock
	GuestBookingRepository grepo;

	@Mock
	BusRepository brepo;
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSaveBooking() throws ParseException, ResourceNotFoundException{
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date yourDate = sdf.parse("2022-07-20");
		Guest book = new Guest("M123", "Mahi", 3, 234567880, "mahi@gmail.com", 300, "Mahi", 123450, 02, 2023, 3450, yourDate, "Mumbai", "Delhi", "Ac", "23:50", "23:50", "62d122ce22846e1dc4fae12a", "2022-07-20");
		when(grepo.save(any(Guest.class))).thenReturn(book);
		
		String response = guestbookingcontroller.saveBooking(book.getBusId(),book);
		
		assertEquals("saved", response);
		
		
	/*	Booking b=new Booking();
		Guest g=new Guest("ABC123", "ABC", 150, 912345670, "abc@gmail.com", 1000, "abc", 123456, 02, 2024, 1267, yourDate, "mumbai", "delhi", "AC", "20:30", "10:00", "abc567", "2022-08-26");
		/*Bus busd=brepo.findById("62c6b6d1e410116a2d6b526a").orElseThrow(()-> new ResourceNotFoundException("Booking not found for this Id :" +"62c6b6d1e410116a2d6b526a"));
		

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date yourDate = sdf.parse("2000-08-26");
		
		Booking b =new Booking();
		Guest g=new Guest();
		g.setBusId("62c6b6d1e410116a2d6b526a");
		g.setPassengerName(b.getPassengerName());
		g.setNumberOfseats(b.getNumberOfseats());

		g.setTotalCost(b.getTotalCost());
		g.setEmail(b.getEmail());
		g.setDepartureLocation("Delhi");
		g.setArrivalLocation("Mumbai");
		g.setArrivalTime("20:30");
		g.setDepartureTime("20:00");
		g.setPhoneNumber(b.getPhoneNumber());
		g.setCreditDebitCard(b.getCreditDebitCard());
		g.setNameOnCard(b.getNameOnCard());
		g.setCvv(b.getCvv());
		g.setExpMonth(b.getExpMonth());
		g.setExpYear(b.getExpYear());
		g.setDateOfBooking(yourDate);
		g.setBusType("AC");
		g.setTotalCost(b.getTotalCost());
		g.setJourneyDate("2022-09-26");
		

		when(grepo.save(any(Guest.class))).thenReturn(g);

		String response =  guestbookingcontroller.saveBooking("62c6b6d1e410116a2d6b526a",b );

		assertEquals("saved", response);*/
		
	}

	@Test
	void testDeleteBooking()  {
		grepo.deleteById("62d2b2b75f2805530189555f");
		
		assertThat(grepo.existsById("62d2b2b75f2805530189555f")).isFalse();
			
	}

	/*@Test
	void testGetLatestBooking() {
		fail("Not yet implemented");
	}*/

}
