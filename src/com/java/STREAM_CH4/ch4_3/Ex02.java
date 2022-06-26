package com.java.STREAM_CH4.ch4_3;

import com.java.STREAM_CH4.entity.Dish;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getDishes();
        List<String> names = new ArrayList<>();
        for( Dish dish : menu) {    // 메뉴 리스트를 명시적으로 순차 반복한다.
            names.add(dish.getName());  // 이름을 추출해서 리스트에 추가한다.
        }
    }
}
