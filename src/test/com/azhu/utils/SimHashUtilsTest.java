package com.azhu.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimHashUtilsTest {

    @Test
    void getHash() {
        String txt1 = "这是一个文本测试";
        System.out.println(SimHashUtils.getHash(txt1));
    }

    @Test
    void getSimHash() {
        String txt2 = "这是一个文本测试";
        System.out.println(SimHashUtils.getHash(txt2));
    }
}