package com.shrad.bookmovies.api;

import com.shrad.bookmovies.dao.model.Reservations;
import com.shrad.bookmovies.service.ReservationsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationsController {

    private final ReservationsService reservationsService;

    public ReservationsController(ReservationsService reservationsService) {
        this.reservationsService = reservationsService;
    }

    @GetMapping("/bookings/{userName}")
    public List<Reservations> getAllBookingsByUser(@PathVariable ("userName") String userName) {
        return reservationsService.getAllReservationsByUser();
    }

}
