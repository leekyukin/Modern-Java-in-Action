package com.java.STREAM_CH4.ch4_4;

import com.java.STREAM_CH4.entity.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();

        List<String> names = menu.stream()  // 요리 리스트에서 스트림 얻기
                .filter(dish -> dish.getCalories() > 300) // 중간 연산
                .map(Dish::getName) // 중간 연산
                .limit(3)   // 중간 연산
                .collect(Collectors.toList());  // 스트림을 리스트로 변환
    }
}
