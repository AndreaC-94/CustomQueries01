package co.develhope.CustomQueries01.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long flightId;
    private String description;
    private String fromAirport;
    private String toairport;
    private FlightEnum status;
}