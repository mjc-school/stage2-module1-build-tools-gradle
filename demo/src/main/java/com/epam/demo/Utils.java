package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        if (args == null || args.isEmpty()) {
            return false;
        }

        for (String s :
                args) {
            if (!NumberUtils.isCreatable(s)) {
                return false;
            }

            float n = NumberUtils.createFloat(s);
            if (n < 0) {
                return false;
            }
        }

        return true;
    }
}