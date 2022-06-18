package com.java.chapter4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Ex1 과 같은 연산에서 스트림을 사용한 코드
public class Ex2 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        List<String> lowCaloricDishesName = menu.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
    }
}
