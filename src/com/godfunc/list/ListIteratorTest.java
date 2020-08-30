package com.godfunc.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author godfunc
 * @email godfunc@outlook.com
 * @date 2020/8/28
 */
public class ListIteratorTest {

    @Test
    public void nextAdd() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() == 3) {
                // 添加到了 3 的后面
                listIterator.add(2);
                break;
            }
        }
        System.out.println(list);

    }

    @Test
    public void previousAdd() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        ListIterator<Integer> previousIterator = list.listIterator(list.size());
        while (previousIterator.hasPrevious()) {
            if (previousIterator.previous() == 3) {
                // 添加到了 3 的前面
                previousIterator.add(2);
                break;
            }
        }
        System.out.println(list);
    }

    @Test
    public void iteratorTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.next());
    }


}
