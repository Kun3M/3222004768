package com.azhu.utils;

import org.junit.jupiter.api.Test;

public class HammingUtilsTest {
    @Test
    void getHammingDistanceTest() {
        String a = "11110001010110110";
        String b = "11111001011110110";
        System.out.println(HammingUtils.getHammingDistance(a,b));
    }
}
