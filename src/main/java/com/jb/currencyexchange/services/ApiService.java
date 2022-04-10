package com.jb.currencyexchange.services;

import com.jb.currencyexchange.dto.*;
import com.jb.currencyexchange.exceptions.*;

public interface ApiService {

    InfoDto convertAmount(String from, String to, double amount) throws CurrencyExchangeException;

    void clearCache();

}
