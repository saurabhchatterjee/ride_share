package com.rideshare.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rideshare.app.entity.Riders;
import com.rideshare.app.repository.RiderRepository;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1/riders")
public class RiderController {
    
private final Logger logger = Logger.getLogger(RiderController.class.getName());
private final RiderRepository riderRepository;

public RiderController(RiderRepository riderRepository) {
    this.riderRepository = riderRepository;
}

@PostMapping(path = "/add")
public Riders addRider(@RequestBody Riders rider) {
    logger.info("POST request made to /api/v1/riders");

    // Add code here to add a rider to the database

    return riderRepository.save(rider);
}


@GetMapping(path = "/all")
public Iterable<Riders> getAllRiders() {
    logger.info("GET request made to /api/v1/riders");

    // Add code here to get all riders from the database

    return riderRepository.findAll();
}




}