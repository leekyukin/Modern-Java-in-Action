package com.java.STREAM_CH4.ch4_4;

import com.java.STREAM_CH4.entity.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();

        List<String> names = menu.stream()
                .filter(dish -> {
                    System.out.println("filtering:" + dish.getName());
                    return dish.getCalories() > 300;
                })  // 필터링한 요리명을 출력한다.
                .map(dish -> {
                    System.out.println("mapping:" + dish.getName());
                    return dish.getName();
                })  // 추출한 요리명을 출력한다.
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
