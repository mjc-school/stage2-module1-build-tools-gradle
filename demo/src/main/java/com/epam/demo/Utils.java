package com.epam.demo;

import com.epam.utils.StringUtils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;
import java.util.function.Predicate;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().filter(Predicate.not(StringUtils::isPositiveNumber)).findFirst().isEmpty();

    }

    public static void main(String[] args) {
        List<String> list = List.of("11.22","2", "33","87");
        System.out.println(isAllPositiveNumbers(list));
    }

}
