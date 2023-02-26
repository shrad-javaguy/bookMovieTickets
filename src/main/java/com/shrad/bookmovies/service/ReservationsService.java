package com.shrad.bookmovies.service;

import com.shrad.bookmovies.repository.model.Reservations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationsService {
    public List<Reservations> getAllReservationsByUser() {
        return new ArrayList<Reservations>();
    }
}
