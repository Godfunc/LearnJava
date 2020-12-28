package com.godfunc.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author godfunc
 * @date 2020/12/28
 */
public class FixDelayTheadTest {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactory() {
            AtomicLong theadNum = new AtomicLong(0);

            @Override
            public Thread newThread(Runnable r) {
                long num = theadNum.incrementAndGet();
                SecurityManager securityManager = System.getSecurityManager();
                ThreadGroup  threadGroup = Thread.currentThread().getThreadGroup();
                Thread thread = new Thread(threadGroup, r, "测试线程-" + num, 0);
                thread.setDaemon(false);
                return thread;
            }
        });


        scheduledThreadPoolExecutor.schedule(() -> {
            System.out.println(1);
            if (System.currentTimeMillis() % 2 == 0) {
                scheduledThreadPoolExecutor.schedule(() -> {
                    System.out.println(1);
                }, 10, TimeUnit.SECONDS);
            }
        }, 10, TimeUnit.SECONDS);

    }
}
