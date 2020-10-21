package com.godfunc.lock;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author godfunc
 * @date 2020/10/3
 */
public class AQSTest {

    @Test
    public void implAQS() {
        AbstractQueuedSynchronizer sync = new AbstractQueuedSynchronizer() {
            @Override
            protected boolean tryAcquire(int arg) {
                if(compareAndSetState(0, 1)) {
                    setExclusiveOwnerThread(Thread.currentThread());
                    return true;
                }
                return false;
            }

            @Override
            protected boolean tryRelease(int arg) {
                if(getState() == 0) {
                    throw new IllegalMonitorStateException();
                }
                setExclusiveOwnerThread(null);
                setState(0);
                return true;
            }

            @Override
            protected boolean isHeldExclusively() {
                return getState() == 1;
            }
        };
    }
}
