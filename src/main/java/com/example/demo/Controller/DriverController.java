package com.example.demo.Controller;

import com.example.demo.Repo.DriverRepo;
import com.example.demo.Models.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {
    @Autowired
    private DriverRepo driverRepo;
    @GetMapping(value = "/driver")
    public List<Driver> getDriver() { return driverRepo.findAll(); }
    @PostMapping(value = "/driver/create")
    public Driver getDriverCreate(@RequestBody Driver driver) { return driverRepo.save(driver); }
    @PutMapping(value = "driver/save/{id}")
    public String getDriverSave(@PathVariable long id, @RequestBody Driver driver)
    {
        Driver saveDriver = driverRepo.findById(id).get();
        saveDriver.setAge(driver.getAge());
        saveDriver.setFirstname(driver.getFirstname());
        saveDriver.setLastname(driver.getLastname());
        saveDriver.setCars(driver.getCars());
        saveDriver.setRoute(driver.getRoute());
        driverRepo.save(saveDriver);
        return "Save";
    }
    @DeleteMapping(value = "/driver/delete/{id}")
    public String getDriverDelete(@PathVariable long id)
    {
        Driver driverDelete = driverRepo.findById(id).get();
        driverRepo.delete(driverDelete);
        return "Driver" + id + "delete";
    }
}
