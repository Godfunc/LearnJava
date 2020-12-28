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
                ThreadGroup threadGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(), "延时通知线程组");
                Thread thread = new Thread(threadGroup, r, "测试线程-" + num, 0);
                thread.setDaemon(false);
                return thread;
            }
        });


        scheduledThreadPoolExecutor.schedule(() -> {
            System.out.println(Thread.currentThread().getThreadGroup().getName() + "-"+ Thread.currentThread().getName());

        }, 5, TimeUnit.SECONDS);

    }
}
