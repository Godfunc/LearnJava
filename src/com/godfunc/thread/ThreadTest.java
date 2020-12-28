package com.godfunc.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author godfunc
 * @date 2020/9/29
 */
public class ThreadTest {

    @Test
    public void threadStatusTest() {
        Thread thread = new Thread(() -> System.out.println(1));
    }


    @Test
    public void daemonTest() {

    }

    /**
     * 只有最后一个用户线程退出后，jvm才会退出，同时也会将守护线程退出。
     * 如果 childThead 是守护线程(daemon=true) jvm将在10秒手退出（也就是在主线程(用户线程 daemon=false)执行完成后退出)
     * 如果 childThead 是用户线程，childThead将一直执行输出1，jvm不退出
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().isDaemon());
        Thread childThead = new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//        childThead.setDaemon(true);
        childThead.start();
        TimeUnit.SECONDS.sleep(10);
    }

}
