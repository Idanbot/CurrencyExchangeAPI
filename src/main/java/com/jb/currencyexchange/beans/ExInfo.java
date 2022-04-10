package com.jb.currencyexchange.beans;

import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExInfo {

    public String provider;

    public String warningUpgradeToV6;

    public String terms;

    public String base;

    public String date;

    public Integer timeLastUpdated;

    private Map<String, Double> rates = new HashMap<>();
}
