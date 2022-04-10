package com.jb.currencyexchange.exceptions;

import org.springframework.http.*;

public enum ErrMsg {
    BAD_PARAM("Something went wrong with your request, check your parameters", HttpStatus.BAD_REQUEST),
    AMOUNT("Amount cannot be negative",HttpStatus.BAD_REQUEST),
    BAD_CURRENCY("Something went wrong with your request, check your currency codes",HttpStatus.BAD_REQUEST),
    ZERO_AMOUNT("Amount cannot be zero, result will always be zero",HttpStatus.BAD_REQUEST),
    SAME_CURRENCY("Try converting different currencies",HttpStatus.BAD_REQUEST);

    private final String description;
    private final HttpStatus status;

    ErrMsg(String desc, HttpStatus status) {
        this.description = desc;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
