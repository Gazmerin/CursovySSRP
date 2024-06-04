package com.example.demo.Models;

import jakarta.persistence.*;
@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String lastname;
    @Column
    private String firstname;
    @Column
    private int age;
    @Column
    private int cars = 0;

    @Column
    private int route = 0;

    public Long getDriverid() {
        return id;
    }

    public void setDriverid(Long driverid) {
        this.id = driverid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Integer getCars() {
        return cars;
    }

    public void setCars(Integer cars) {
        this.cars = cars;
    }

    public Integer getRoute() {
        return route;
    }

    public void setRoute(Integer route) {
        this.route = route;
    }
}
