package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.CarColorService;
import com.etiya.rentacar.business.requests.CreateCarColorRequest;
import com.etiya.rentacar.business.requests.UpdateCarColorRequest;
import com.etiya.rentacar.business.responses.GetAllCarColorResponse;
import com.etiya.rentacar.business.responses.GetByIdCarColorResponse;
import com.etiya.rentacar.core.utilities.mappers.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.CarColorRepository;
import com.etiya.rentacar.entities.concretes.CarColor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarColorManager implements CarColorService {
    CarColorRepository brandColorRepository;
    ModelMapperService modelMapperService;

    @Override
    public List<GetAllCarColorResponse> getAll() {
        List<CarColor> brandColors = brandColorRepository.findAll();
        List<GetAllCarColorResponse> brandColorResponses = brandColors.stream()
                .map(brandColor -> this.modelMapperService.forResponse().map(brandColor, GetAllCarColorResponse.class))
                .collect(Collectors.toList());
        return brandColorResponses;
    }

    @Override
    public GetByIdCarColorResponse getById(int id) {
        CarColor brandColor = brandColorRepository.findById(id).orElseThrow();

        GetByIdCarColorResponse byIdBrandColorResponse = this.modelMapperService.forResponse()
                .map(brandColor, GetByIdCarColorResponse.class);

        return byIdBrandColorResponse;

    }

    @Override
    public void add(CreateCarColorRequest createBrandColorRequest) {
        CarColor brandColor = this.modelMapperService.forRequest()
                .map(createBrandColorRequest, CarColor.class);

        brandColorRepository.save(brandColor);

    }

    @Override
    public void update(UpdateCarColorRequest updateBrandColorRequest) {
        CarColor brandColor = this.modelMapperService.forRequest()
                .map(updateBrandColorRequest, CarColor.class);

        brandColorRepository.save(brandColor);
    }

    @Override
    public void delete(int id) {
        brandColorRepository.deleteById(id);
    }
}
