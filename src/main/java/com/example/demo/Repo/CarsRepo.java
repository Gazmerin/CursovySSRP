package com.example.demo.Repo;

import com.example.demo.Models.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepo extends JpaRepository<Cars, Long> {

}
