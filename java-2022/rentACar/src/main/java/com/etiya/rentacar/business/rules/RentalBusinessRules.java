package com.etiya.rentacar.business.rules;

import com.etiya.rentacar.core.utilities.enums.States;
import com.etiya.rentacar.core.utilities.exceptions.BusinessException;
import com.etiya.rentacar.dataAccess.abstracts.CarRepository;
import com.etiya.rentacar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RentalBusinessRules {
    private CarRepository carRepository;

    public boolean checkIfCarAvailable(int id) {
        Car car = carRepository.findById(id).orElseThrow();
        if (car.getState() == States.AVAILABLE) {
            return true;
        }
        throw new BusinessException("Car not available");
    }

}
