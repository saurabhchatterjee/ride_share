package com.rideshare.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rideshare.app.entity.Riders;

public interface RiderRepository extends JpaRepository<Riders, Long> {
}
