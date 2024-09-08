package com.azhu.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TxtIOUtilsTest {

    @Test
    void readTxt() {
        String str = TxtIOUtils.readTxt("C:\\Users\\HONOR\\IdeaProjects\\PaperCheck2\\wenjian\\orig_0.8_add.txt");

        System.out.println(str);
    }

    @Test
    void writeTxt() {
        TxtIOUtils.writeTxt(Double.parseDouble("0.22"),"C:\\Users\\HONOR\\IdeaProjects\\PaperCheck2\\wenjian\\orig_0.8_add.txt");
    }
}