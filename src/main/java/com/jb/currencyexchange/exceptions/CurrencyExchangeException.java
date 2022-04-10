package com.jb.currencyexchange.exceptions;

public class CurrencyExchangeException extends Exception{
    private final ErrMsg errMsg;

    public CurrencyExchangeException(ErrMsg errMsg){
        super(errMsg.getDescription());
        this.errMsg = errMsg;
    }

    public ErrMsg getErrMsg() {
        return errMsg;
    }
}
