package co.develhope.CustomQueries01.controllers;

import co.develhope.CustomQueries01.entities.Flight;
import co.develhope.CustomQueries01.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/generate50")
    public ResponseEntity generate(){
        return flightService.generate();
    }

    @GetMapping("/signleFlight")
    public Optional<Flight> singleFlight(@RequestParam long id){
        return flightService.singleFlight(id);
    }

    @GetMapping("/getAll")
    public List<Flight> flights(){
        return flightService.flight();
    }
}
