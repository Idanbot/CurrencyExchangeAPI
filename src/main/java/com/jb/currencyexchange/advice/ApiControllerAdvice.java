package com.jb.currencyexchange.advice;

import com.jb.currencyexchange.exceptions.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(value = {CurrencyExchangeException.class})
    public ResponseEntity<?> handleErrors(CurrencyExchangeException e) {
        ErrMsg errMsg = e.getErrMsg();
        HttpStatus status = errMsg.getStatus();
        ErrDto errDto = new ErrDto("Currency Exchange API", e.getMessage());
        return new ResponseEntity<>(errDto, status);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public ErrDto handleNotFound() {
        return new ErrDto("Currency Exchange API","Page Not Found - 404");
    }
}
