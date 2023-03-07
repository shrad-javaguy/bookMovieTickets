package com.shrad.bookmovies.dao.repository;

import com.shrad.bookmovies.dao.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservations, Long>, JpaSpecificationExecutor<Reservations> {
    @Query(value = "from reservations where userid = ?1 and reservationdate = ?2")
    List<Reservations> getAllReservationByUSerByDate(String userid, Date date);
}
