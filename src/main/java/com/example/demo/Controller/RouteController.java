package com.example.demo.Controller;

import com.example.demo.Models.Route;
import com.example.demo.Repo.RouteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RouteController {
    @Autowired
    private RouteRepo routeRepo;
    @GetMapping(value = "/route")
    public List<Route> getRoute() { return routeRepo.findAll(); }
    @PostMapping(value = "/route/create")
    public Route getRouteCreate(@RequestBody Route route) { return routeRepo.save(route); }
    @PutMapping(value = "/route/save/{id}")
    public String updateRoute(@PathVariable long id, @RequestBody Route route)
    {
        Route updateRoute = routeRepo.findById(id).get();
        updateRoute.setStatus(route.getStatus());
        updateRoute.setKuda(route.getKuda());
        updateRoute.setOtkuda(route.getOtkuda());
        routeRepo.save(updateRoute);
        return "Save";
    }
    @DeleteMapping(value = "/route/delete/{id}")
    public String deleteRoute(@PathVariable long id)
    {
        Route routeDelete = routeRepo.findById(id).get();
        routeRepo.delete(routeDelete);
        return "Route"+id+"delete";
    }
}
