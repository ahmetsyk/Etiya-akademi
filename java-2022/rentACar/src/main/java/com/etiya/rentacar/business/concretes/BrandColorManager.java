package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.BrandColorService;
import com.etiya.rentacar.business.requests.CreateBrandColorRequest;
import com.etiya.rentacar.business.requests.UpdateBrandColorRequest;
import com.etiya.rentacar.business.responses.GetAllBrandColorResponse;
import com.etiya.rentacar.business.responses.GetByIdBrandColorResponse;
import com.etiya.rentacar.core.utilities.mappers.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.BrandColorRepository;
import com.etiya.rentacar.entities.concretes.BrandColor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandColorManager implements BrandColorService {
    BrandColorRepository brandColorRepository;
    ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandColorResponse> getAll() {
        List<BrandColor> brandColors = brandColorRepository.findAll();
        List<GetAllBrandColorResponse> brandColorResponses = brandColors.stream()
                .map(brandColor -> this.modelMapperService.forResponse().map(brandColor, GetAllBrandColorResponse.class))
                .collect(Collectors.toList());
        return brandColorResponses;
    }

    @Override
    public GetByIdBrandColorResponse getById(int id) {
        BrandColor brandColor = brandColorRepository.findById(id).orElseThrow();

        GetByIdBrandColorResponse byIdBrandColorResponse = this.modelMapperService.forResponse()
                .map(brandColor,GetByIdBrandColorResponse.class);

        return byIdBrandColorResponse;

    }

    @Override
    public void add(CreateBrandColorRequest createBrandColorRequest) {
        BrandColor brandColor = this.modelMapperService.forRequest()
                .map(createBrandColorRequest,BrandColor.class);

        brandColorRepository.save(brandColor);

    }

    @Override
    public void update(UpdateBrandColorRequest updateBrandColorRequest) {
        BrandColor brandColor = this.modelMapperService.forRequest()
                .map(updateBrandColorRequest,BrandColor.class);

        brandColorRepository.save(brandColor);
    }

    @Override
    public void delete(int id) {
        brandColorRepository.deleteById(id);
    }
}
