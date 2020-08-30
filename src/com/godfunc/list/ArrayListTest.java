package com.godfunc.list;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author godfunc
 * @email godfunc@outlook.com
 * @date 2020/8/30
 */
public class ArrayListTest {

    @Test
    public void growCountTest() throws NoSuchFieldException, IllegalAccessException {
        int defaultCap = 15;
        for (int i = 0; i < 5; i++) {
            defaultCap = defaultCap + (defaultCap >> 1);
            System.out.println(defaultCap);
        }

        /*
        * 0000 0000 0000 1010 10
        * 0000 0000 0000 0101 5  + 10 = 15
        * 0000 0000 0000 1101 15
        * 0000 0000 0000 0110 6  + 15 = 22
        * 0000 0000 0001 0110 22
        * 0000 0000 0000 1011 11 + 22 = 33
        * 0000 0000 0010 0001 33
        * 0000 0000 0001 0000 16 + 33 = 49
        * */
    }
}
