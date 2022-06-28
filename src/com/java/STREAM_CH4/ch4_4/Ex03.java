package com.java.STREAM_CH4.ch4_4;

import com.java.STREAM_CH4.entity.Dish;

import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();

        menu.stream().forEach(System.out::println);
    }
}
