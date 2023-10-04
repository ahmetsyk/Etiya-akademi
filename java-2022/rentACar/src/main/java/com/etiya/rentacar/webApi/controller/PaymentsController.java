package com.etiya.rentacar.webApi.controller;


import com.etiya.rentacar.business.abstracts.PaymentService;
import com.etiya.rentacar.business.requests.CreatePaymentRequest;
import com.etiya.rentacar.business.requests.UpdatePaymentRequest;
import com.etiya.rentacar.business.responses.GetAllPaymentResponse;
import com.etiya.rentacar.business.responses.GetByIdPaymentResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/payments")
public class PaymentsController {
    private PaymentService paymentService;

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void pay(@RequestBody CreatePaymentRequest createPaymentRequest) {
        paymentService.add(createPaymentRequest);
    }

    @GetMapping()
    public List<GetAllPaymentResponse> getAll(){
        return paymentService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdPaymentResponse getById(@PathVariable int id){
        return this.paymentService.getById(id);
    }

    @PutMapping()
    public void update(@RequestBody UpdatePaymentRequest updatePaymentRequest){
        this.paymentService.update(updatePaymentRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.paymentService.delete(id);
    }

}
