package com.example.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void powerTest1() {
        double actualAnswer = MathUtil.power(1, 1);
        assertEquals(1.0, actualAnswer, "TC1:テスト失敗");
    }

    @Test
    void powerTest2() {
        try {
            MathUtil.power(100, 0);
            fail("例外発生なし");
        } catch (IllegalArgumentException e) {
            assertEquals("100以上の値は不正です。", e.getMessage(), "テスト失敗");
        }
    }
}