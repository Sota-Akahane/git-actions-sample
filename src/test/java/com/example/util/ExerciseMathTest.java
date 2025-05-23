package com.example.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseMathTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test1() {
        RuntimeException runtimeException =
                assertThrows(RuntimeException.class,
                        () -> ExerciseMath.factorial(-1));
        assertEquals("0以下の値は不正です。", runtimeException.getMessage(), "テスト失敗");
    }

    @Test
    void test2() {
        RuntimeException runtimeException =
                assertThrows(RuntimeException.class,
                        () -> ExerciseMath.factorial(0));
        assertEquals("0以下の値は不正です。", runtimeException.getMessage(), "テスト失敗");
    }

    @Test
    void test3() {
        int actualAnswer = ExerciseMath.factorial(1);
        assertEquals(1, actualAnswer, "テスト失敗");
    }

    @Test
    void test4() {
        int actualAnswer = ExerciseMath.factorial(12);
        assertEquals(479001600, actualAnswer, "テスト失敗");
    }

    @Test
    void test5() {
        RuntimeException runtimeException =
                assertThrows(RuntimeException.class,
                        () -> ExerciseMath.factorial(13));
        assertEquals("13以上の値は不正です。", runtimeException.getMessage(), "テスト失敗");
    }
}