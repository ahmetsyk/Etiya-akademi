package com.etiya.rentacar.business.rules;

import com.etiya.rentacar.core.utilities.exceptions.BusinessException;
import com.etiya.rentacar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ModelBusinessRules {
    ModelRepository modelRepository;

    public void checkIfModelNameExists(String name) throws RuntimeException{
        if (this.modelRepository.existsByName(name)){
            throw new BusinessException("Model already exists");
        }
    }
}
