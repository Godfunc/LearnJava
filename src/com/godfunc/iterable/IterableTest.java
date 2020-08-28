package com.godfunc.iterable;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author godfunc
 * @email godfunc@outlook.com
 * @date 2020/8/27
 */
public class IterableTest {

    @Test
    public void spliteratorTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        Spliterator<Integer> spliterator = Spliterators.spliteratorUnknownSize(list.iterator(), 0);
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        Spliterator<Integer> spliterator2 = spliterator1.trySplit();
        Spliterator<Integer> spliterator3 = spliterator2.trySplit();
//        spliterator1.forEachRemaining(System.out::println);
        do {
        } while (spliterator1.tryAdvance(System.out::println));
        System.out.println("----");
//        spliterator2.forEachRemaining(System.out::println);
        do {
        } while (spliterator2.tryAdvance(System.out::println));
        System.out.println("----");
        spliterator3.forEachRemaining(System.out::println);
        do {
        } while (spliterator3.tryAdvance(System.out::println));
    }
}

