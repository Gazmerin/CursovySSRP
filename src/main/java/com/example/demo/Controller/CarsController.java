package com.example.demo.Controller;

import com.example.demo.Models.Cars;
import com.example.demo.Repo.CarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Models.Dostup;

import java.util.List;

@RestController
public class CarsController {
    @Autowired
    private CarsRepo carsRepo;
    @GetMapping(value = "/cars")
    public List<Cars> getCars() { return carsRepo.findAll(); }
    @PostMapping(value = "/cars/create")
    public Cars createCars(@RequestBody Cars cars) { return carsRepo.save(cars); }
    @PutMapping(value = "/cars/save/{id}")
    public String updateCars(@PathVariable long id, @RequestBody Cars cars, @RequestBody Dostup dostup)
    {
        if(getEditDostup() != 2) return "Доступ запрещён";
        Cars updateCar = carsRepo.findById(id).get();
        updateCar.setModel(cars.getModel());
        updateCar.setName(cars.getName());
        updateCar.setStatus(cars.getStatus());
        carsRepo.save(updateCar);
        return "Save";
    }
    @DeleteMapping(value = "/cars/delete/{id}")
    public String deleteCars(@PathVariable long id)
    {
        Cars carsDelete = carsRepo.findById(id).get();
        carsRepo.delete(carsDelete);
        return "Cars" + id + "delete";
    }
}
