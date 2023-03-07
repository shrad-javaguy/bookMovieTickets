package com.shrad.bookmovies.dao.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "theatre")
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "theatre_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
}
