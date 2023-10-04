package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.RentalService;
import com.etiya.rentacar.business.requests.CreateRentalRequest;
import com.etiya.rentacar.business.requests.UpdateRentalRequest;
import com.etiya.rentacar.business.responses.GetAllRentalResponse;
import com.etiya.rentacar.business.responses.GetByIdRentalResponse;
import com.etiya.rentacar.business.rules.RentalBusinessRules;
import com.etiya.rentacar.core.utilities.mappers.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.RentalRepository;
import com.etiya.rentacar.entities.concretes.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {
    private RentalRepository rentalRepository;
    private ModelMapperService modelMapperService;
    private RentalBusinessRules businessRules;

    @Override
    public List<GetAllRentalResponse> getAll() {
        List<Rental> rentals = rentalRepository.findAll();
        List<GetAllRentalResponse> rentalsResponses = rentals.stream()
                .map(rental -> this.modelMapperService.forResponse()
                        .map(rental, GetAllRentalResponse.class))
                .collect(Collectors.toList());
        return rentalsResponses;
    }

    @Override
    public GetByIdRentalResponse getById(int id) {
        Rental rentals = rentalRepository.findById(id).orElseThrow();
        GetByIdRentalResponse  getByIdRentalResponse= modelMapperService.forResponse().map(rentals, GetByIdRentalResponse.class);
        return getByIdRentalResponse;

    }

    @Override
    public void add(CreateRentalRequest createRentalRequest) {
        if(businessRules.checkIfCarAvailable(createRentalRequest.getCarId())){
            Rental rentals = modelMapperService.forRequest().map(createRentalRequest, Rental.class);
            rentalRepository.save(rentals);

        }

    }

    @Override
    public void update(UpdateRentalRequest updateRentalRequest) {
        Rental rentals = modelMapperService.forRequest().map(updateRentalRequest, Rental.class);
        rentalRepository.save(rentals);

    }

    @Override
    public void delete(int id) {
        rentalRepository.deleteById(id);
    }
}
