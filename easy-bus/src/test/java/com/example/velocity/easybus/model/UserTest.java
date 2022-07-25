package com.example.velocity.easybus.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	
	User u=new User("M123", "Mahi", "mahi@gmail.com", "2022-08-09","mahi", "9876543210");
    User u2=new User();
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testUser() {
		
		User u3=u2;
		assertEquals(u3, u2);
	}

	@Test
	void testUserStringStringStringStringStringString() {
		User u1=u;
		assertEquals(u1, u);
	}

	@Test
	void testGetId() {
		String expected="M123";
		String actual=u.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetName() {
		String expected="Mahi";
		String actual=u.getName();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		String expected="mahi@gmail.com";
		String actual=u.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDob() {
		String expected="2022-08-09";
		String actual=u.getDob();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPassword() {
		String expected="mahi";
		String actual=u.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPhoneNo() {
		String expected="9876543210";
		String actual=u.getPhoneNo();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id="M100";
		User user=new User();
		user.setId(id);
		assertEquals(user.getId(),id);
	}

	@Test
	void testSetName() {
		String name="ABC";
		User user=new User();
		user.setName(name);
		assertEquals(user.getName(),name);
	}

	@Test
	void testSetEmail() {
		String email="M@gmail.com";
		User user=new User();
		user.setEmail(email);
		assertEquals(user.getEmail(),email);
	}

	@Test
	void testSetDob() {
		String d="2020-05-04";
		User user=new User();
		user.setDob(d);
		assertEquals(user.getDob(),d);
	}

	@Test
	void testSetPassword() {
		String password="m12a";
		User user=new User();
		user.setPassword(password);
		assertEquals(user.getPassword(),password);
	}

	@Test
	void testSetPhoneNo() {
		String pn="7654321098";
		User user=new User();
		user.setPhoneNo(pn);
		assertEquals(user.getPhoneNo(),pn);
	}

	@Test
	void testEqualsObject() {
		User u1=new User("M123", "Mahi", "mahi@gmail.com", "2022-08-09","mahi", "9876543210");
		

		boolean expected=u.equals(u1);
		assertEquals(true,expected );
	}

	@Test
	void testToString() {
		User u1=u;
		
		assertEquals(u.toString(), u1.toString());
	}

}
