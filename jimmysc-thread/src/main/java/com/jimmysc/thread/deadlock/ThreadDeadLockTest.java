package com.jimmysc.thread.deadlock;

/**
 * <pre>
 * jimmy
 * 2014��10��16��
 * </pre>
 **/
public class ThreadDeadLockTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }
}
