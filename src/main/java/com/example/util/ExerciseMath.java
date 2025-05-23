package com.example.util;

public class ExerciseMath {
    public static int factorial(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("0以下の値は不正です。");
        }

        if (num >= 13) {
            throw new IllegalArgumentException("13以上の値は不正です。");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer = answer * i;
        }

        return answer;
    }
}
