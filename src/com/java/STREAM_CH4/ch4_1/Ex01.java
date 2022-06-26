package com.java.STREAM_CH4.ch4_1;

import com.java.STREAM_CH4.entity.Dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Ex2 와 같은 연산에서 스트림을 사용하지 않은 코드
public class Ex01 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        List<Dish> lowCaloricDishes = new ArrayList<>();

        for ( Dish dish : menu ) {
            if (dish.getCalories() < 400)
                lowCaloricDishes.add(dish);
        }
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish dish1, Dish dish2) {
                return Integer.compare(dish1.getCalories(), dish2.getCalories());
            }
        });
        List<String> lowCaloricDishesName = new ArrayList<>();
        for(Dish dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
        }
    }
}
