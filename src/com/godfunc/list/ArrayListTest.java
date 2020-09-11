package com.godfunc.list;

import com.godfunc.entity.Student;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
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

    @Test
    public void cloneTest() {
        Student tom = new Student("tom", 11);
        ArrayList<Student> list = new ArrayList<>();
        list.add(tom);
        list.add(new Student("jack", 12));
        list.add(new Student("jms", 24));
        ArrayList<Student> cloneList = (ArrayList<Student>) list.clone();
        cloneList.add(new Student("mock", 14));
        tom.setAge(22);
        System.out.println(list);
        System.out.println(cloneList);
    }

    @Test
    public void toArrayTTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] arrays = list.toArray(new Integer[5]);
        System.out.println(Arrays.toString(arrays));
    }

    @Test
    public void removeIfTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(11);
        boolean b = list.removeIf(x -> x % 2 == 0);
    }

    @Test
    public void biSetTest() {
        BitSet bitSet = new BitSet();
        bitSet.set(1);
        bitSet.set(3);
        bitSet.set(4);
        for (int i = 0; i < 20; i++) {
            System.out.println((i=bitSet.nextClearBit(i)));
        }
    }

    @Test
    public void sortTest() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(33);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(11);
        list.sort((a, b) -> {
            return a.compareTo(b);
        });
        System.out.println(list);
    }
}
