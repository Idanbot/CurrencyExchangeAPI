package com.jb.currencyexchange.services;

import com.jb.currencyexchange.beans.*;
import com.jb.currencyexchange.dto.*;
import com.jb.currencyexchange.exceptions.*;
import com.jb.currencyexchange.http.*;
import com.jb.currencyexchange.utils.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.cache.*;
import org.springframework.data.redis.cache.*;
import org.springframework.stereotype.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private final ExGrabber exGrabber;
    private final RedisCacheManager redisCacheManager;

    @Override
    public InfoDto convertAmount(String from, String to, double amount) throws CurrencyExchangeException {

        Validation.validateAmount(amount);
        Validation.validateCurrencyCodes(from, to);

        ExInfo exInfo = exGrabber.grabData(from);

        double res = exInfo.getRates().get(to) * amount;

        log.info("[$]Valid API request - from:" + from + " to:" + to + " amount:" + amount);

        return new InfoDto(from, to, amount, res);
    }

    @Override
    public void clearCache() {
        Cache cache = redisCacheManager.getCache("exchange");

        if (cache != null) {
            cache.clear();
            log.info("[$]Redis Cache cleared");
        }
    }
}
