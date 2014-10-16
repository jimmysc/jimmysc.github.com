package com.jimmysc.thread.deadlock;

/**
 * <pre>
 * jimmy
 * 2014��10��16��
 * </pre>
 **/
public class Thread1 implements Runnable {

    @Override
    public void run() {
        synchronized (ThreadLock1.class) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            synchronized (ThreadLock2.class) {
                System.out.println("Thread1 run finish!");
            }
        }
    }

}
