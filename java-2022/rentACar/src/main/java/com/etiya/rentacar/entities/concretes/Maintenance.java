package com.etiya.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "maintenances")
@Entity
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "sendDate")
    private Date sendDate;

    @Column(name = "returnDate")
    private Date returnDate;

//    @Column(name = "repairPrice")
//    private double repairPrice;

    @ManyToOne
    @JoinColumn(name = "carId")
    private Car car;

    }

