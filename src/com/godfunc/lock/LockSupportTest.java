package com.godfunc.lock;

import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.security.Security;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author godfunc
 * @date 2020/10/23
 */
public class LockSupportTest {

    @Test
    public void test1() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("线程开始执行");
            LockSupport.park(); // park
            System.out.println("线程执行结束");
        });
        t1.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("开始唤醒线程");
         LockSupport.unpark(t1); // unpark
        t1.join();
    }
}
