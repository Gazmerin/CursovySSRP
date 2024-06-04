package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String otkuda;
    @Column
    private String kuda;
    @Column
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOtkuda() {
        return otkuda;
    }

    public void setOtkuda(String otkuda) {
        this.otkuda = otkuda;
    }

    public String getKuda() {
        return kuda;
    }

    public void setKuda(String kuda) {
        this.kuda = kuda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
