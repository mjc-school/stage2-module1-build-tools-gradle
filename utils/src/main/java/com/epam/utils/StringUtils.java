package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (!NumberUtils.isCreatable(str)) {
            return false;
        }

        float n = NumberUtils.createFloat(str);
        return n > 0;
    }


}
