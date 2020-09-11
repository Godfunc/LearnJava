package com.godfunc.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author godfunc
 * @email godfunc@outlook.com
 * @date 2020/9/3
 */
public class HashMapTest {

    @Test
    public void calcNodeIndexTest() {
        int currentCapacity = 64;

        Integer i = Integer.MAX_VALUE;
        // 111 1111 1111 1111 1111 1111 1111 1111
        System.out.println(i);
        int p = (currentCapacity - 1) & i;
        System.out.println(p);

        /**
         * 0000 1111  15
         * 0000 0001  1
         * 0000 0001  1
         *
         *
         */
        System.out.println(1 << 30);
        for (int binCount = 0; ; ++binCount) {
            System.out.println(binCount);
            if(binCount == 10){
                break;
            }
        }
    }

    @Test
    public void tableSizeForTest() {
        int cap = 20;
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println( (n < 0) ? 1 : (n >= 10000) ? 10000 : n + 1);
    }

    @Test
    public void putTest() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(20, 0.75F);
        map.put(1,1);
    }

    @Test
    public void resizeTest() {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 13; i++) {
            map.put(i+1, i+1);
        }
    }

    @Test
    public void resizeTest2() {
        System.out.println(63&33);
    }

    @Test
    public void putIfAbsent() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, null);
        map.put(3, 3);
        Integer ret = map.putIfAbsent(1, 1);
        System.out.println(ret);
        System.out.println(map);
        ret = map.putIfAbsent(2, 2);
        System.out.println(ret);
        System.out.println(map);
        ret = map.putIfAbsent(3, 33);
        System.out.println(ret);
        System.out.println(map);
    }
}
