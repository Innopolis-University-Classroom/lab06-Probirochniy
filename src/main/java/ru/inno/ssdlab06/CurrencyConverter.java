package com.company;

import java.util.Objects;

public class CurrencyConverter {
    double USD = 1, RUB = 0.01, EUR = 1.12, JPY = 0.0086, GBP = 1.34, CAD = 0.78, AUD = 0.72;

    double convert(double sum, String cur1, String cur2){
        double k1 = 0, k2 = 0;
        if(Objects.equals(cur1, "USD")) k1 = USD;
        if(Objects.equals(cur2, "USD")) k2 = USD;

        if(Objects.equals(cur1, "CAD")) k1 = CAD;
        if(Objects.equals(cur2, "CAD")) k2 = CAD;
        if(Objects.equals(cur1, "JPY")) k1 = JPY;
        if(Objects.equals(cur2, "JPY")) k2 = JPY;

        if(Objects.equals(cur1, "AUD")) k1 = AUD;
        if(Objects.equals(cur2, "AUD")) k2 = AUD;

        if(Objects.equals(cur1, "EUR")) k1 = EUR;
        if(Objects.equals(cur2, "EUR")) k2 = EUR;

        if(Objects.equals(cur1, "RUB")) k1 = RUB;
        if(Objects.equals(cur2, "RUB")) k2 = RUB;

        if(Objects.equals(cur1, "GBP")) k1 = GBP;
        if(Objects.equals(cur2, "GBP")) k2 = GBP;

        double result = 0;
        if(k1 == 0 || k2 == 0) return 0;
        else {result = sum * k1 / k2;}


        return result;
    }
}
