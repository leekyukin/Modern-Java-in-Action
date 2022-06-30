package com.java.STREAM_USES_CH5.ch5_2;

import com.java.STREAM_CH4.entity.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex03 {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );

        List<Dish> dishes = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());  // rice, chicken, french fries 목록
    }
}
