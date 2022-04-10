package com.jb.currencyexchange.utils;

import com.jb.currencyexchange.exceptions.*;

import java.util.*;

public class Validation {

    static List<String> validCodes = Arrays.asList(
            "USD","AED","AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN",
            "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD",
            "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC",
            "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR",
            "FJD", "FKP", "FOK", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ",
            "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD",
            "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KID", "KMF",
            "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD",
            "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN",
            "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN",
            "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR",
            "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "SSP", "STN",
            "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD",
            "TZS", "UAH", "UGX", "UYU", "UZS", "VES", "VND", "VUV", "WST", "XAF", "XCD",
            "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWL");

    public static void validateAmount(double amount) throws CurrencyExchangeException {
        if (amount < 0)
            throw new CurrencyExchangeException(ErrMsg.AMOUNT);

        if (amount == 0)
            throw new CurrencyExchangeException(ErrMsg.ZERO_AMOUNT);
    }

    public static void validateCurrencyCode(String code) throws CurrencyExchangeException {
        if (code.length() != 3)
            throw new CurrencyExchangeException(ErrMsg.BAD_CURRENCY);

        if (!validCodes.contains(code))
            throw new CurrencyExchangeException(ErrMsg.BAD_CURRENCY);
    }

    public static void validateCurrencyCodes(String from, String to) throws CurrencyExchangeException {
        if (from.equals(to))
            throw new CurrencyExchangeException(ErrMsg.SAME_CURRENCY);

        validateCurrencyCode(from);
        validateCurrencyCode(to);
    }
}
