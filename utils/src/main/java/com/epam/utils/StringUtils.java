package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public StringUtils() {
    }

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isParsable(str) && Double.parseDouble(str) > 0.0;
    }

    public static void main(String[] args) {
        System.out.println(isPositiveNumber("12"));
    }
}
