package com.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseMathTest2 {

    @Test
    void _1を渡すと1が返る() {
        // 準備
        ExerciseMath2 exerciseMath2 = new ExerciseMath2();

        // 実行
        int actual = exerciseMath2.factorial(1);

        // 検証
        assertEquals(1, actual);
    }

    @Test
    void _2を渡すと2が返る() {

        ExerciseMath2 exerciseMath2 = new ExerciseMath2();

        int actual = exerciseMath2.factorial(2);

        assertEquals(2, actual);
    }
}
