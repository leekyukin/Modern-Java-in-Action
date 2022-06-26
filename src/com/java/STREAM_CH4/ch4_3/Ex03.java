package com.java.STREAM_CH4.ch4_3;

import com.java.STREAM_CH4.entity.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Ex03 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        List<String> names = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());
    }
}
