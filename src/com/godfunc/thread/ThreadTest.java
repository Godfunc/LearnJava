package com.godfunc.thread;

import org.junit.jupiter.api.Test;

/**
 * @author godfunc
 * @date 2020/9/29
 */
public class ThreadTest {

    @Test
    public void threadStatusTest() {
        Thread thread = new Thread(() -> System.out.println(1));
    }

}
