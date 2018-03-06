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
public class QueryPaymentStatusApiController implements QueryPaymentStatusApi {

	@Autowired
    PaymentService paymentService;

    public ResponseEntity<ApiResponseMessage> postQueryPaymentStatus(@ApiParam(value = "Status of a payment in the transaction" ,required=true )  @Valid @RequestBody ApiRequest body) {
    	String result = paymentService.getPaymentStatus();
    	ApiResponseMessage apiResponseMessage = new ApiResponseMessage();
    	apiResponseMessage.setMessage(result);
    	return ResponseEntity.accepted().body(apiResponseMessage);
    }

}
