package com.java.STREAM_USES_CH5.ch5_2;

import com.java.STREAM_CH4.entity.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {

        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
                );

        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());  // seasonal fruit, prawns 목록

        List<Dish> slicedMenu = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());   // seasonal fruit, prawns 목록

    }
}
