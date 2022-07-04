package com.example.velocity.easybus.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.velocity.easybus.model.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {
	
	List<Booking> findByEmail(String email);

}
