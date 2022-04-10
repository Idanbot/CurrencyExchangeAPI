package com.jb.currencyexchange.advice;

import com.jb.currencyexchange.exceptions.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(value = {CurrencyExchangeException.class})
    public ResponseEntity<?> handleErrors(CurrencyExchangeException e) {
        ErrMsg errMsg = e.getErrMsg();
        HttpStatus status = errMsg.getStatus();
        ErrDto errDto = new ErrDto("Currency Exchange API", e.getMessage());
        return new ResponseEntity<>(errDto, status);
    }
}
