package com.godfunc.list;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author godfunc
 * @email godfunc@outlook.com
 * @date 2020/9/1
 */
public class LinkedListTest {

    @Test
    public void listIteratorTest(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    @Test
    public void descendingIteratorTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> descendingIterator = list.descendingIterator();
        while (descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }
    }
}
