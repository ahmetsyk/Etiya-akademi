package com.etiya.rentacar.business.requests;

import com.etiya.rentacar.entities.concretes.Brand;
import com.etiya.rentacar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelRequest {
    private int id;
    private String name;
    private Brand brand;
}
