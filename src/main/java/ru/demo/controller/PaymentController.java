package ru.demo.controller;


import org.springframework.web.bind.annotation.*;
import ru.demo.entity.BaseResponse;
import ru.demo.entity.PaymentRequest;

import static ru.demo.util.BaseResponseData.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping
    public BaseResponse showStatus() {
        return new BaseResponse(SUCCESS_STATUS, 1);
    }

    @PostMapping("/pay")
    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest paymentRequest) {
        if(sharedKey.equalsIgnoreCase(key)) {
            int userId = paymentRequest.getUserId();
            String itemId = paymentRequest.getItemId();
            double discount = paymentRequest.getDiscount();

            return getSuccess();
        } else {
            return getFailure();
        }
    }

}
