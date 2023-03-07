package com.shrad.bookmovies.dao.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rid")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonManagedReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "swid")
    @JsonManagedReference
    private ShowTime showTime;

    @ManyToOne
    @JoinColumn(name = "tid")
    @JsonManagedReference
    private Theatre theatre;

    @Column(name = "booking_time")
    private LocalTime bookingTime;

    @Column(name = "is_booked")
    private boolean isBooked;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "booked_seats")
    private String bookedSeats;
}
