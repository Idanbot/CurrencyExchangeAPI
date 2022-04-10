package com.jb.currencyexchange.clr;

import com.jb.currencyexchange.http.*;
import lombok.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class Init implements CommandLineRunner {

    private final ExGrabber exGrabber;

    @Override
    public void run(String... args) throws Exception {

    }
}
