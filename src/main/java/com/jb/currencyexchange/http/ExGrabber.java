package com.jb.currencyexchange.http;

import com.jb.currencyexchange.beans.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.client.*;

@Service
public class ExGrabber {

    public static final String URL = "https://api.exchangerate-api.com/v4/latest/";

    RestTemplate restTemplate = new RestTemplate();

    public ExInfo grabData(String fromCurrency) {
        ResponseEntity<ExInfo> response = restTemplate.getForEntity(URL+fromCurrency, ExInfo.class);

        return response.getBody();
    }

}
