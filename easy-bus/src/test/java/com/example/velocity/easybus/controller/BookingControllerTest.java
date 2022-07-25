package com.example.velocity.easybus.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.velocity.easybus.exception.ResourceNotFoundException;
import com.example.velocity.easybus.model.Booking;
import com.example.velocity.easybus.model.Bus;
import com.example.velocity.easybus.model.User;
import com.example.velocity.easybus.repository.BookingRepository;
import com.example.velocity.easybus.repository.UserRepository;

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

@SpringBootTest
@RunWith(SpringRunner.class)
class BookingControllerTest {

	@InjectMocks
	BookingController bookController;

	@Mock
	BookingRepository bookrepo;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*
	@Test
	void testSaveBooking() throws ParseException, ResourceNotFoundException  {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		
		Booking book = new Booking("1234", "Sanjana", 2, 1000, 2000, 999789000, "Sanjana", 899765777, 8, 2030, 1234, null, "2022-07-15", "Sanju@gmail.com", "Mumbai", "Delhi", "luxury", null, null, "2022-07-26", null, null);

		when(bookrepo.save(any(Booking.class))).thenReturn(book);

		String response = bookController.saveBooking("62c868bbf6a63e7ece096221", "sanju@gmail.com", book);

		assertEquals("booking saved successfully", response);
	}*/

	/*@Test
	void testGetBookingByEmail() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		List<Booking> book = List.of(new Booking("1234", "Mahi", 2, 1000, 2000, 999789000, "Mahi", 899765777, 8, 2030, 1234, null, "2022-07-15", "abc@ims.com", "Mumbai", "Delhi", "luxury", null, null, "2022-07-26", null, null));
		
		//brepo.save(bus);
		
		when(bookrepo.findByEmail("abc@ims.com")).thenReturn(book);
		
		//Optional<Bus> bus1=<Optional>(busController.getBusById("abc101")
		
		
		assertEquals(book, bookController. getBookingByEmail("abc@ims.com"));
		
	}*/

	@Test
	void testDeleteBooking() {
        bookrepo.deleteById("62d82e13009f940a1dcbdd9c");
		
		assertThat(bookrepo.existsById("62d82e13009f940a1dcbdd9c")).isFalse();
	}

	@Test
	void testSaveBus() {
		Booking book = new Booking("1234", "Mahi", 2, 1000, 2000, 999789000, "Mahi", 899765777, 8, 2030, 1234, null, "2022-07-15", "mahi@gmail.com", "Mumbai", "Delhi", "luxury", null, null, "2022-07-26", null, null);

		when(bookrepo.save(any(Booking.class))).thenReturn(book);

		String response = bookController.saveBus(book);

		assertEquals("saved", response);
	}

	@Test
	void testGetAllBookings() {
		when(bookrepo.findAll()).thenReturn(Stream.of(
				new Booking("1234", "Sanjana", 2, 1000, 2000, 999789000, "Sanjana", 899765777, 8, 2030, 1234, null, "2022-07-15", "Sanju@gmail.com", "Mumbai", "Delhi", "luxury", null, null, "2022-07-26", null, null),
				new Booking("1234", "Sanjana", 2, 1000, 2000, 999789000, "Sanjana", 899765777, 8, 2030, 1234, null, "2022-07-15", "Sanju@gmail.com", "Mumbai", "Delhi", "luxury", null, null, "2022-07-26", null, null))
				.collect(Collectors.toList()));
		assertEquals(2, bookController.getAllBookings().size());
	}

	/*@Test
	void testGetLatestBooking() {
		
		Booking book = new Booking("1234", "Mahi", 2, 1000, 2000, 999789000, "Mahi", 899765777, 8, 2030, 1234, null, "2022-07-15", "mahi@gmail.com", "Mumbai", "Delhi", "luxury", null, null, "2022-07-26", null, null);

		when(bookrepo.save(any(Booking.class))).thenReturn(book);

		
		List<Booking> allBooking=bookrepo.findAll();  //invokes findAll() method of Mongo repository
		
	
		Booking latest=allBooking.get();
		assertEquals(latest, bookController.getLatestBooking());
	/*when(bookrepo.findAll()).thenReturn(Stream.of(
				new Booking("1234", "Sanjana", 2, 1000, 2000, 999789000, "Sanjana", 899765777, 8, 2030, 1234, null, "2022-07-15", "Sanju@gmail.com", "Mumbai", "Delhi", "luxury", null, null, "2022-07-26", null, null))

				.collect(Collectors.toList()));
		assertEquals(2, bookController.getLatestBooking().size());
		
	}*/

}