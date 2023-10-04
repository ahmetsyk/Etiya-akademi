package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.ModelService;
import com.etiya.rentacar.business.requests.CreateModelRequest;
import com.etiya.rentacar.business.requests.UpdateModelRequest;
import com.etiya.rentacar.business.responses.GetAllModelsResponse;
import com.etiya.rentacar.business.responses.GetByIdModelResponse;
import com.etiya.rentacar.business.rules.ModelBusinessRules;
import com.etiya.rentacar.core.utilities.mappers.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.ModelRepository;
import com.etiya.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    private ModelBusinessRules modelBusinessRules;
    //private BrandRepository brandRepository;

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetAllModelsResponse> modelsResponse = models.stream().
                map(model -> this.modelMapperService.forResponse().
                        map(model, GetAllModelsResponse.class)).collect(Collectors.toList());
    return modelsResponse;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        this.modelBusinessRules.checkIfModelNameExists(createModelRequest.getName());
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
        //model.setBrand(this.brandRepository.getById(createModelRequest.getBrandId()));
        this.modelRepository.save(model);
    }

    @Override
    public void update(UpdateModelRequest updateModelRequest) {
        Model model = this.modelMapperService.forRequest().map(updateModelRequest,Model.class);

        modelRepository.save(model);
    }

    @Override
    public void delete(int id) {
        this.modelRepository.deleteById(id);
    }

    @Override
    public GetByIdModelResponse getById(int id) {
        Model model = this.modelRepository.findById(id).orElseThrow();
        GetByIdModelResponse responseItem = this.modelMapperService.forResponse().map(model,GetByIdModelResponse.class);
        return responseItem;
    }
}
