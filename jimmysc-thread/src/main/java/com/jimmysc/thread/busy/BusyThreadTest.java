package com.jimmysc.thread.busy;

/**
 * <pre>
 * jimmy
 * 2014Äê10ÔÂ17ÈÕ
 * </pre>
 **/
public class BusyThreadTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new BusyThread1(), "BusyThread-" + i);
            t.start();
        }
    }
}
