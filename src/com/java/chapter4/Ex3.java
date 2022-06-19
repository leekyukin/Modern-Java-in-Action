package com.java.chapter4;

import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        List<String> threeHighCaloricDishNames = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(threeHighCaloricDishNames);
    }
}
