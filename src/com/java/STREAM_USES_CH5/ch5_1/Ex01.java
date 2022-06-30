package com.java.STREAM_USES_CH5.ch5_1;

import com.java.STREAM_CH4.entity.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();

        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian) // 채식 요리인지 확인하는 메서드 참조
                .collect(Collectors.toList());
    }
}
