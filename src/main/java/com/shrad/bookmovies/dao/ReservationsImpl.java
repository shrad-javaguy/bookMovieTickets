package com.shrad.bookmovies.dao;

import com.shrad.bookmovies.dao.model.Reservations;
import com.shrad.bookmovies.dao.repository.ReservationsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.List;

public class ReservationsImpl {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private final ReservationsRepository reservationsRepository;

    public ReservationsImpl (final ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    public List<Reservations> getAllReservationByUser(String userId, Date date){
        return reservationsRepository.getAllReservationByUSerByDate(userId, date);
    }

}
