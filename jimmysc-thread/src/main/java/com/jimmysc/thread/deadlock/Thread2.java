package com.jimmysc.thread.deadlock;

/**
 * <pre>
 * jimmy
 * 2014Äê10ÔÂ16ÈÕ
 * </pre>
 **/
public class Thread2 implements Runnable {

    @Override
    public void run() {
        synchronized (ThreadLock2.class) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            synchronized (ThreadLock1.class) {
                System.out.println("Thread2 run finish!");
            }
        }
    }
}
