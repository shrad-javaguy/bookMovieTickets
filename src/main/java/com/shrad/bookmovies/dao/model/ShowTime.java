package com.shrad.bookmovies.dao.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "showTime")
public class ShowTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "swid")
    private Long id;

    @OneToMany(mappedBy = "movie")
    @JsonBackReference
    private Movie movie;

    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Theatre> theatres;

    @Column(name = "startTime")
    private String startTime;

    @Column(name = "endTime")
    private String endTime;

    @Column(name = "duration")
    private String duration;

    @Column(name = "is_active")
    private boolean isActive;
}
