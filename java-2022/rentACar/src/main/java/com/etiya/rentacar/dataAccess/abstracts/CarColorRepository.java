package com.etiya.rentacar.dataAccess.abstracts;

import com.etiya.rentacar.entities.concretes.CarColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarColorRepository extends JpaRepository<CarColor,Integer> {
}
