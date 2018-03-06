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
public class CancelPaymentApiController implements CancelPaymentApi {

    @Autowired
    PaymentService paymentService;

    public ResponseEntity<ApiResponseMessage> postCancelPayment(@ApiParam(value = "Cancel the payment" ,required=true )  @Valid @RequestBody ApiRequest body) {
        // do some magic!
    	String result = paymentService.cancelPayment();
    	ApiResponseMessage apiResponseMessage = new ApiResponseMessage();
    	apiResponseMessage.setMessage(result);
    	return ResponseEntity.accepted().body(apiResponseMessage);
    }

}
