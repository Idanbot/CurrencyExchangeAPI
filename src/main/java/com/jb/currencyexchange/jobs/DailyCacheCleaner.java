package com.jb.currencyexchange.jobs;

import com.jb.currencyexchange.services.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class DailyCacheCleaner {

    private final ApiServiceImpl apiService;

    @Scheduled(cron = "@daily")
    public void clearCacheJob() {
        apiService.clearCache();
        log.info("[$]Daily cache cleaner job has finished, Redis Cache is cleared");
    }
}
