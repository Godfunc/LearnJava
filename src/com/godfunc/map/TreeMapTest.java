package com.godfunc.map;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

/**
 * @author godfunc
 * @date 2020/9/11
 */
public class TreeMapTest {

    @Test
    public void test1() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1,1);
        treeMap.put(4,2);
        treeMap.put(5,8);
        treeMap.put(2,3);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
    }
}
