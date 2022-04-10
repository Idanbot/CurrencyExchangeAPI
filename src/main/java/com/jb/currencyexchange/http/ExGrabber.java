package com.jb.currencyexchange.http;

import com.jb.currencyexchange.beans.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.cache.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.client.*;

@Slf4j
@Service
public class ExGrabber {

    public static final String URL = "https://api.exchangerate-api.com/v4/latest/";

    @Autowired
    RestTemplate restTemplate;

    @Cacheable("exchange")
    public ExInfo grabData(String fromCurrency) {
        ResponseEntity<ExInfo> response = restTemplate.getForEntity(URL+fromCurrency, ExInfo.class);

        log.info("[$]GET request to exchange api for currency " + fromCurrency);

        return response.getBody();
    }

}
