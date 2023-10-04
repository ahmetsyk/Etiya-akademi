package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.CreditCardService;
import com.etiya.rentacar.business.abstracts.PaymentService;
import com.etiya.rentacar.business.requests.CreatePaymentRequest;
import com.etiya.rentacar.business.requests.UpdatePaymentRequest;
import com.etiya.rentacar.business.responses.GetAllPaymentResponse;
import com.etiya.rentacar.business.responses.GetByIdPaymentResponse;
import com.etiya.rentacar.business.rules.PaymentBusinessRules;
import com.etiya.rentacar.core.utilities.exceptions.BusinessException;
import com.etiya.rentacar.core.utilities.mappers.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.PaymentRepository;
import com.etiya.rentacar.dataAccess.abstracts.RentalRepository;
import com.etiya.rentacar.entities.concretes.Payment;
import com.etiya.rentacar.entities.concretes.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PaymentManager implements PaymentService {
    private ModelMapperService modelMapperService;
    private PaymentRepository paymentRepository;
    private RentalRepository rentalRepository;
    private CreditCardService creditCardService;
    private PaymentBusinessRules payRules;



    @Transactional
    @Override
    public void add(CreatePaymentRequest createPaymentRequest) {
        if(creditCardService.cardPayment(createPaymentRequest.getCardDetail())){
            Payment payment = modelMapperService.forRequest().map(createPaymentRequest, Payment.class);
            double totalPrice= payRules.calculateRentalTotalPrice(createPaymentRequest.getRentalId());
            payment.setTotalPrice( totalPrice);
            paymentRepository.save(payment);

            Rental rentals = rentalRepository.findById(createPaymentRequest.getRentalId()).orElseThrow();
            rentals.setPaid(true);
            rentalRepository.save(rentals);

        }
        else { throw new BusinessException("Payment could not be received.");
        }
    }


    @Override
    public List<GetAllPaymentResponse> getAll() {
        List<Payment> payments = this.paymentRepository.findAll();
        List<GetAllPaymentResponse> paymentResponses = payments.stream()
                .map(payment -> this.modelMapperService.forResponse()
                        .map(payment,GetAllPaymentResponse.class)).collect(Collectors.toList());
        return paymentResponses;
    }

    @Override
    public GetByIdPaymentResponse getById(int id) {
        Payment payment = this.paymentRepository.findById(id).orElseThrow();

        GetByIdPaymentResponse paymentResponse= modelMapperService.forResponse().map(payment,GetByIdPaymentResponse.class);
        return paymentResponse;
    }

    @Override
    public void update(UpdatePaymentRequest updatePaymentRequest) {
        Payment payment = this.modelMapperService.forRequest().map(updatePaymentRequest,Payment.class);

        this.paymentRepository.save(payment);
    }

    @Override
    public void delete(int id) {
        this.paymentRepository.deleteById(id);
    }
}
