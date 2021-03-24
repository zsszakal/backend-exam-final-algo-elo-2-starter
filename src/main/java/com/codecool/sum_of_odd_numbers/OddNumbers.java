package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 != 0) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }
}