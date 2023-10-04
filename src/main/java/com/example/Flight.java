package com.example;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private String destination;
    private String origin;
    private List<Passenger> passengersList;

    public Flight(String flightNumber, String destination, String origin) {
        // TODO: Initialize the attributes
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.passengersList = new ArrayList<Passenger>();
    }

    // TODO: Implement methods to book a flight for a passenger and cancel a booking
    public void bookPassenger(Passenger passenger) {
        passengersList.add(passenger);
    }

    // Method to cancel a booking for a passenger
    public void cancelBooking(Passenger passenger) {
        passengersList.remove(passenger);
    }

    // You can also add a method to get the list of passengers if needed
    public List<Passenger> getPassengers() {
        return passengersList;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }



}
