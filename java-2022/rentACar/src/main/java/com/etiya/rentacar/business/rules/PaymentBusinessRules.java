package com.etiya.rentacar.business.rules;

import com.etiya.rentacar.dataAccess.abstracts.CarRepository;
import com.etiya.rentacar.dataAccess.abstracts.RentalRepository;
import com.etiya.rentacar.entities.concretes.Car;
import com.etiya.rentacar.entities.concretes.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PaymentBusinessRules {
    private CarRepository carRepository;
    private RentalRepository rentalRepository;

    public double calculateRentalTotalPrice(int id){

        Rental rental =  rentalRepository.findById(id).orElseThrow();

        Car car = carRepository.findById(rental.getCar().getId()).orElseThrow();

        double total = rental.getRentedForDays()*car.getDailyPrice();

        return total;
    }
}
