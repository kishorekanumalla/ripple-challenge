package io.swagger.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiParam;
import io.swagger.model.ApiRequest;
import io.swagger.service.PaymentService;

@Controller
public class UpdatePaymentStatusApiController implements UpdatePaymentStatusApi {
	
	@Autowired
    PaymentService paymentService;


    public ResponseEntity<ApiResponseMessage> postUpdatePaymentStatus(@ApiParam(value = "Update the status of the payments" ,required=true )  @Valid @RequestBody ApiRequest body) {
    	String result = paymentService.updatePayment();
    	ApiResponseMessage apiResponseMessage = new ApiResponseMessage();
    	apiResponseMessage.setMessage(result);
    	return ResponseEntity.accepted().body(apiResponseMessage);
    }

}
