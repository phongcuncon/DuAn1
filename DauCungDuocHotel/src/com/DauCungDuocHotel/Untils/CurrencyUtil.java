package com.DauCungDuocHotel.Untils;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtil {
    public static String format(int amount) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(amount);
    }

}
