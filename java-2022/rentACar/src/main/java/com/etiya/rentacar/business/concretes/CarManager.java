package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.CarService;
import com.etiya.rentacar.business.requests.CreateCarRequest;
import com.etiya.rentacar.business.requests.UpdateCarRequest;
import com.etiya.rentacar.business.responses.GetAllCarResponse;
import com.etiya.rentacar.business.responses.GetByIdCarResponse;
import com.etiya.rentacar.core.utilities.mappers.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.CarRepository;
import com.etiya.rentacar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private CarRepository carRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllCarResponse> getAll() {
        List<Car> cars = this.carRepository.findAll();

        List<GetAllCarResponse> responseList = cars.stream().
                map(car -> this.modelMapperService.forResponse()
                        .map(car,GetAllCarResponse.class)).collect(Collectors.toList());

        return responseList;
    }

    @Override
    public GetByIdCarResponse getById(int id) {

        Car car = this.carRepository.findById(id).orElseThrow();
        GetByIdCarResponse carResponse = this.modelMapperService.forResponse().map(car,GetByIdCarResponse.class);
        return carResponse;
    }

    @Override
    public void add(CreateCarRequest createCarRequest) {
        Car car = this.modelMapperService.forRequest().map(createCarRequest,Car.class);
        this.carRepository.save(car);
    }

    @Override
    public void update(UpdateCarRequest updateCarRequest) {
        Car car = this.modelMapperService.forRequest().map(updateCarRequest,Car.class);
        this.carRepository.save(car);
    }

    @Override
    public void delete(int id) {
        this.carRepository.deleteById(id);
    }
}
