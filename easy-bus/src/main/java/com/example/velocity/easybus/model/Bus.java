package com.example.velocity.easybus.model;

import java.util.Date;

//import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bus")
public class Bus {
	
	@Id
	private String id;
	
	private int busNo;
	private String departureLocation;
	private String arrivalLocation;
	
	private String departureTime;
	private String arrivalTime;
	
	private Date date;
	
	private String driverName;
	private String driverContact;
	
	private double price;

	

	public Bus() {
		
	}



	public Bus(int busNo, String departureLocation, String arrivalLocation, String departureTime,
			String arrivalTime, Date date, String driverName, String driverContact, double price) {
		super();
		this.busNo = busNo;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.date = date;
		this.driverName = driverName;
		this.driverContact = driverContact;
		this.price = price;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public int getBusNo() {
		return busNo;
	}



	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}



	public String getDepartureLocation() {
		return departureLocation;
	}



	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}



	public String getArrivalLocation() {
		return arrivalLocation;
	}



	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}



	public String getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}



	public String getArrivalTime() {
		return arrivalTime;
	}



	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getDriverName() {
		return driverName;
	}



	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}



	public String getDriverContact() {
		return driverContact;
	}



	public void setDriverContact(String driverContact) {
		this.driverContact = driverContact;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}







	

	
	
	
}
