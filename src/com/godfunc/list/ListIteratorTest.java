package com.godfunc.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author godfunc
 * @email godfunc@outlook.com
 * @date 2020/8/28
 */
public class ListIteratorTest {

    @Test
    public void add() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next() == 3){
                listIterator.add(2);
            }
        }
        /*while (listIterator.hasNext()){
            if(listIterator.next() == 4){
                if(listIterator.hasPrevious()){
                    System.out.println(listIterator.previous());
                    listIterator.add(2);
                    break;
                }
            }
        }*/
        System.out.println(list);
    }
}
