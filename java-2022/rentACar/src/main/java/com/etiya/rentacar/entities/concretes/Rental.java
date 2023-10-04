package com.etiya.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rentals")
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "rentedForDays")
    private int rentedForDays;

    @Column(name = "date")
    private Date date;

    @Column(name = "paid")
    private boolean paid=false;

    @ManyToOne()
    @JoinColumn(name = "carId")
    private Car car;

    @OneToMany(mappedBy = "rental")
    private List<Payment> payments;
}
