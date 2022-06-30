package com.java.STREAM_USES_CH5.ch5_2;

import com.java.STREAM_CH4.entity.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();

        List<Dish> dishes = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());
    }
}
