package com.jb.currencyexchange.services;

import com.jb.currencyexchange.beans.*;
import com.jb.currencyexchange.dto.*;
import com.jb.currencyexchange.exceptions.*;
import com.jb.currencyexchange.http.*;
import com.jb.currencyexchange.utils.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService{

    private final ExGrabber exGrabber;

    @Override
    public InfoDto convertAmount(String from, String to, double amount) throws CurrencyExchangeException {

        Validation.validateAmount(amount);
        Validation.validateCurrencyCodes(from,to);

        ExInfo exInfo = exGrabber.grabData(from);

        double res = exInfo.getRates().get(to) * amount;

        return new InfoDto(from,to,amount,res);
    }
}
