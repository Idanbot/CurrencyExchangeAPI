package com.jb.currencyexchange.controllers;

import com.jb.currencyexchange.dto.*;
import com.jb.currencyexchange.exceptions.*;
import com.jb.currencyexchange.services.*;
import lombok.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("money/")
public class ApiController {

    private final ApiServiceImpl apiService;

    @GetMapping(value = "convert")
    public InfoDto getExchange(@RequestParam("from") String from,
                               @RequestParam("to") String to,
                               @RequestParam("amount") Double amount) throws CurrencyExchangeException {

        return apiService.convertAmount(from,to,amount);
    }

}
