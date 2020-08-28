package com.godfunc.collection;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author godfunc
 * @email godfunc@outlook.com
 * @date 2020/8/28
 */
public class CollectionTest {

    @Test
    public void spliteratorTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Spliterator<Integer> spliterator = list.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        Spliterator<Integer> spliterator2 = spliterator.trySplit();
        Spliterator<Integer> spliterator3 = spliterator.trySplit();

        Optional.ofNullable(spliterator1).ifPresent(x -> x.forEachRemaining(System.out::println));
        System.out.println("---");
        Optional.ofNullable(spliterator2).ifPresent(x -> x.forEachRemaining(System.out::println));
        System.out.println("---");
        Optional.ofNullable(spliterator3).ifPresent(x -> x.forEachRemaining(System.out::println));
    }


    @Test
    public void removeIfTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.removeIf(x -> x % 2 == 0);
        System.out.println(list.toString());
    }

    @Test
    public void toArrayTTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Integer[] arrays = list.toArray(new Integer[5]);
        System.out.println(Arrays.toString(arrays));
    }
}
