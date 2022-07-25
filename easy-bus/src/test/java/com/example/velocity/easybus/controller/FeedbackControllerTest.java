package com.example.velocity.easybus.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


import com.example.velocity.easybus.model.Feedback;

import com.example.velocity.easybus.repository.FeedbackRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
class FeedbackControllerTest {
	
	@InjectMocks
	FeedbackController feedbackcontroller;
	
	@Mock
	FeedbackRepository frepo;


	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void testSaveFeedback() throws ParseException{
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));


		/*Feedback feedback = new Feedback("abcd101","abc@gmail.com","good");

		when(frepo.save(any(Feedback.class))).thenReturn(feedback);

		String response =  feedbackcontroller.saveFeedback(feedback);

		assertEquals("feedback saved successfully", response);*/
		
		Feedback feedback=new Feedback();
		feedback.setId("M123");
		feedback.setEmail("mahi@gmail.com");
		feedback.setComments("Great");
		feedback.hashCode();
		
		feedback.toString();
		when(frepo.save(any(Feedback.class))).thenReturn(feedback);

		String response =  feedbackcontroller.saveFeedback(feedback);

		assertEquals("feedback saved successfully", response);
	}

	@Test
	void testGetAllFeedback() throws ParseException{
		Feedback feedback = new Feedback("abcd101","abc@gmail.com","good");
		when(frepo.findAll()).thenReturn(Stream.of(
				new Feedback(feedback.getId(),feedback.getEmail(),feedback.getComments()),
				new Feedback("abcde567","cde@gmail.com","nice"))
				
				.collect(Collectors.toList()));
		assertEquals(2, feedbackcontroller.getAllFeedback().size());
	}

}
