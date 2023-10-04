package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.MaintenanceService;
import com.etiya.rentacar.business.requests.CreateMaintenanceRequest;
import com.etiya.rentacar.business.requests.UpdateMaintenanceRequest;
import com.etiya.rentacar.business.responses.GetAllMaintenanceResponse;
import com.etiya.rentacar.business.responses.GetByIdMaintenanceResponse;
import com.etiya.rentacar.core.utilities.enums.States;
import com.etiya.rentacar.core.utilities.mappers.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.CarRepository;
import com.etiya.rentacar.dataAccess.abstracts.MaintenanceRepository;
import com.etiya.rentacar.entities.concretes.Car;
import com.etiya.rentacar.entities.concretes.Maintenance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MaintenanceManager implements MaintenanceService {
    private MaintenanceRepository maintenanceRepository;
    private ModelMapperService modelMapperService;
    private CarRepository carRepository;

    @Override
    public List<GetAllMaintenanceResponse> getAll() {
        List<Maintenance> maintenances = this.maintenanceRepository.findAll();

        List<GetAllMaintenanceResponse> responseList = maintenances.stream()
                .map(maintenance -> this.modelMapperService.forResponse().map(maintenance, GetAllMaintenanceResponse.class)).collect(Collectors.toList());
        return responseList;
    }

    @Override
    public GetByIdMaintenanceResponse getById(int id) {
        Maintenance maintenance = this.maintenanceRepository.findById(id).orElseThrow();

        GetByIdMaintenanceResponse getByIdMaintenanceResponse = this.modelMapperService.forResponse().map(maintenance, GetByIdMaintenanceResponse.class);

        return getByIdMaintenanceResponse;
    }

    @Transactional
    @Override
    public void add(CreateMaintenanceRequest createMaintenanceRequest) {
        Maintenance maintenance = this.modelMapperService.forRequest().map(createMaintenanceRequest,Maintenance.class);
        this.maintenanceRepository.save(maintenance);

        Car car = this.carRepository.findById(createMaintenanceRequest.getCarId()).orElseThrow();
        car.setState(States.UNDER_MAINTENANCE);
        this.carRepository.save(car);
    }

    @Transactional
    @Override
    public void update(UpdateMaintenanceRequest updateMaintenanceRequest) {
        Maintenance maintenance = this.modelMapperService.forRequest().map(updateMaintenanceRequest,Maintenance.class);
        this.maintenanceRepository.save(maintenance);

        Car car = this.carRepository.findById(updateMaintenanceRequest.getCarId()).orElseThrow();
        car.setState(States.AVAILABLE);
        this.carRepository.save(car);
    }

    @Override
    public void delete(int id) {
        this.maintenanceRepository.deleteById(id);
    }

}
