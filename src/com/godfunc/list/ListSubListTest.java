package com.godfunc.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/**
 * @author godfunc
 * @email godfunc@outlook.com
 * @date 2020/8/30
 */
public class ListSubListTest {

    @Test
    public void subListTest(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        List<Integer> subList = list.subList(2, 3);
        if(subList instanceof RandomAccess) {
            System.out.println("random");
        }
        System.out.println(list);
        System.out.println(subList);
        subList.add(5);
        System.out.println(list);
        System.out.println(subList);
    }
}
