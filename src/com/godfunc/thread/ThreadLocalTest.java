package com.godfunc.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author godfunc
 * @date 2020/10/2
 */
public class ThreadLocalTest {

    ThreadLocal<String> threadLocal = new ThreadLocal<>();

    @Test
    public void use() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            threadLocal.set("1");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
            threadLocal.remove();
        }, "t1");

        Thread t2 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            threadLocal.set("2");
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
            threadLocal.remove();
        }, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    @Test
    public void inheritableThreadLocalsTest() throws InterruptedException {
        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();
        inheritableThreadLocal.set("0");
        System.out.println("parent : " + inheritableThreadLocal.get());
        Thread t1  = new Thread(() ->{
            System.out.println("child " + inheritableThreadLocal.get());
            inheritableThreadLocal.remove();
        });
        t1.start();
        t1.join();
    }
}
