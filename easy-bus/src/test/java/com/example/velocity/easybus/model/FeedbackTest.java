package com.example.velocity.easybus.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FeedbackTest {
	
	Feedback feed=new Feedback("62d02a516661e811be6f3e10","bhargav@gmail.com","Good");

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetId() {
		String expected="62d02a516661e811be6f3e10";
		String actual=feed.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		
		String expected="bhargav@gmail.com";
		String actual=feed.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	void testGetComments() {
		String expected="Good";
		String actual=feed.getComments();
		assertEquals(expected, actual);
	}

	@Test
	void testSetEmail() {
		String email="bhargav@gmail.com";
		Feedback feedBack=new Feedback();
		feedBack.setEmail(email);
		
		assertEquals(feedBack.getEmail(), email);
	}

	@Test
	void testSetComments() {
		String comment="Good";
		Feedback feedBack=new Feedback();
		feedBack.setComments(comment);
		assertEquals(feedBack.getComments(),comment );
		
	}

	@Test
	void testFeedbackStringStringString() {
		Feedback feedback=new Feedback("62d02a516661e811be6f3e10","bhargav@gmail.com","Good");
		String email=feedback.getEmail();
		assertEquals("bhargav@gmail.com",email);
	}
	
	@Test
	void testEqualsObject() {
		Feedback feedback=new Feedback("62d02a516661e811be6f3e10","bhargav@gmail.com","Good");
		boolean expected=feedback.equals(feed);
		assertEquals(true,expected );
	}
}
