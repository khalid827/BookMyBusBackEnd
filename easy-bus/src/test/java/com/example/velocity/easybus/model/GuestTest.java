package com.example.velocity.easybus.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GuestTest {

	Date date=new Date(2022, 07, 8);
	Date d1=new Date(2022, 07, 12);
	Guest g=new Guest("abc566","khalid",4,98856632,"khalid566@ims.com",400,"khalidShaik",
					566478,04,2026,2865,date,"Mumbai","Chennai","Normal","10:50","20:45","62c90a145c5b7216b9ceb02f",
					"2022-07-08");
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHashCode() {
		Guest g=new Guest("abc566","khalid",4,98856632,"khalid566@ims.com",400,"khalidShaik",
				566478,04,2026,2865,date,"Mumbai","Chennai","Normal","10:50","20:45","62c90a145c5b7216b9ceb02f",
				"2022-07-08");
		int expected=g.hashCode();
		assertEquals(expected, g.hashCode());
	}

	@Test
	void testGuest() {
		Guest guest=new Guest();
		
		String email=guest.getEmail();
		assertEquals(null,email);
	}

	@Test
	void testGuestStringStringIntLongStringDoubleStringIntIntIntIntDateStringStringStringStringStringStringString() {
		
		Guest guest=new Guest("abc566","khalid",4,98856632,"khalid566@ims.com",400,"khalidShaik",
				566478,04,2026,2865,date,"Mumbai","Chennai","Normal","10:50","20:45","62c90a145c5b7216b9ceb02f",
				"2022-07-08");
		
		String email=guest.getEmail();
		assertEquals("khalid566@ims.com",email);
	}

	@Test
	void testGetId() {
		
		String expected="abc566";
		String actual=g.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPassengerName() {
		
		String expected="khalid";
		String actual=g.getPassengerName();
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetNumberOfseats() {
		
		int expected=4;
		int actual=g.getNumberOfseats();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPhoneNumber() {
		
		long expected=98856632;
		long actual=g.getPhoneNumber();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		
		String expected="khalid566@ims.com";
		String actual=g.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	void testGetTotalCost() {
		
		double expected=400;
		double actual=g.getTotalCost();
		assertEquals(expected, actual);
	
	}

	@Test
	void testGetNameOnCard() {
		
		String expected="khalidShaik";
		String actual=g.getNameOnCard();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCreditDebitCard() {
		
		int expected=566478;
		int actual=g.getCreditDebitCard();
		assertEquals(expected, actual);
	}

	@Test
	void testGetExpMonth() {

		int expected=04;
		int actual=g.getExpMonth();
		assertEquals(expected, actual);
	}

	@Test
	void testGetExpYear() {
		
		int expected=2026;
		int actual=g.getExpYear();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCvv() {
		
		int expected=2865;
		int actual=g.getCvv();
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetDateOfBooking() {
		Date d=date;
		Date actual=g.getDateOfBooking();
		assertEquals(d, actual);
		
	}

	@Test
	void testGetDepartureLocation() {
		
		String expected="Mumbai";
		String actual=g.getDepartureLocation();
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetArrivalLocation() {
		
		String expected="Chennai";
		String actual=g.getArrivalLocation();
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetBusType() {
		
		String expected="Normal";
		String actual=g.getBusType();
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetDepartureTime() {
		
		String expected="10:50";
		String actual=g.getDepartureTime();
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetArrivalTime() {
		
		String expected="20:45";
		String actual=g.getArrivalTime();
		assertEquals(expected, actual);
	}

	@Test
	void testGetBusId() {
		
		String expected="62c90a145c5b7216b9ceb02f";
		String actual=g.getBusId();
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetJourneyDate() {
		
		String expected="2022-07-08";
		String actual=g.getJourneyDate();
		assertEquals(expected, actual);
		
	}

	@Test
	void testSetId() {
		
		String id="abc566";
		
		Guest guest=new Guest();
		guest.setId(id);
		assertEquals(guest.getId(),id);
	}

	@Test
	void testSetPassengerName() {
		
		String passengerName="khalid";
		
		Guest guest=new Guest();
		guest.setPassengerName(passengerName);;
		assertEquals(guest.getPassengerName(),passengerName);	
		
	}

	@Test
	void testSetNumberOfseats() {
		int numberOfseats=4;
		Guest guest=new Guest();
		guest.setNumberOfseats(numberOfseats);
		
		assertEquals(guest.getNumberOfseats(),numberOfseats);
		
	}

	@Test
	void testSetPhoneNumber() {
		
		long phoneNumber=98856632;
		Guest guest=new Guest();
		
		guest.setPhoneNumber(phoneNumber);
		assertEquals(guest.getPhoneNumber(),phoneNumber);
	}

	@Test
	void testSetEmail() {
		String email="abc@gmail.com";
		Booking book=new Booking();
		book.setEmail(email);
		assertEquals(book.getEmail(),email);
	}

	@Test
	void testSetTotalCost() {
	    double tc=1000;
		Booking book=new Booking();
		book.setTotalCost(tc);
		assertEquals(book.getTotalCost(),tc);
	}

	@Test
	void testSetNameOnCard() {
		String nc="MABC";
		Booking book=new Booking();
		book.setNameOnCard(nc);
		assertEquals(book.getNameOnCard(),nc);
	}

	@Test
	void testSetCreditDebitCard() {
		int cardNo=123456;
		Booking book=new Booking();
		book.setCreditDebitCard(cardNo);
		assertEquals(book.getCreditDebitCard(),cardNo);
	}

	@Test
	void testSetExpMonth() {
		int month=11;
		Booking book=new Booking();
		book.setExpMonth(month);
		assertEquals(book.getExpMonth(),month);
	}

	@Test
	void testSetExpYear() {
		int year=2027;
		Booking book=new Booking();
		book.setExpYear(year);
		assertEquals(book.getExpYear(),year);
	}

	@Test
	void testSetCvv() {
		int cvv=908;
		Booking book=new Booking();
		book.setCvv(cvv);
		assertEquals(book.getCvv(),cvv);
	}

	@Test
	void testSetDateOfBooking() {
		Date d=d1;
		Booking book=new Booking();
		book.setDateOfBooking(d);
		assertEquals(book.getDateOfBooking(),d);
		
	}

	@Test
	void testSetDepartureLocation() {
		String loc="Melbourne";
		Booking book=new Booking();
		book.setDepartureLocation(loc);
		assertEquals(book.getDepartureLocation(),loc);
	}

	@Test
	void testSetArrivalLocation() {
		String loc="Darwin";
		Booking book=new Booking();
		book.setArrivalLocation(loc);
		assertEquals(book.getArrivalLocation(),loc);
	}

	@Test
	void testSetBusType() {
		String busType="Normal";
		Booking book=new Booking();
		book.setBusType(busType);
		assertEquals(book.getBusType(),busType);
	}

	@Test
	void testSetDepartureTime() {
		String time="1:00";
		Booking book=new Booking();
		book.setDepartureTime(time);
		assertEquals(book.getDepartureTime(),time);
	}

	@Test
	void testSetArrivalTime() {
		String time="24:00";
		Booking book=new Booking();
		book.setArrivalTime(time);
		assertEquals(book.getArrivalTime(),time);
	}

	@Test
	void testSetBusId() {
		String id="B123";
		Booking book=new Booking();
		book.setBusId(id);
		assertEquals(book.getBusId(),id);
	}

	@Test
	void testSetJourneyDate() {
		String d="2022-07-08";
		Booking book=new Booking();
		book.setJourneyDate(d);
		assertEquals(book.getJourneyDate(),d);
	}

	@Test
	void testEqualsObject() {
		
		Guest guest=new Guest("abc566","khalid",4,98856632,"khalid566@ims.com",400,"khalidShaik",
				566478,04,2026,2865,date,"Mumbai","Chennai","Normal","10:50","20:45","62c90a145c5b7216b9ceb02f",
				"2022-07-08");
		boolean expected=guest.equals(g);
		assertEquals(true,expected );
		
	}

	
	@Test
	void testToString() {
		String expected=g.toString();
		 assertEquals(expected, g.toString());
	}

}