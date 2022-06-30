package com.java.STREAM_USES_CH5.ch5_1;

import com.java.STREAM_CH4.entity.Dish;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}
