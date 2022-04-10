package com.jb.currencyexchange.clr;

import com.jb.currencyexchange.services.*;
import lombok.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class Init implements CommandLineRunner {

    private final ApiServiceImpl apiService;

    @Override
    public void run(String... args) throws Exception {

        apiService.clearCache();
        System.out.println("# Initiating system, Cache is cleared #");

        System.out.println("# Testing service - " + apiService.convertAmount("USD","ILS",100) + " #");
    }
}
