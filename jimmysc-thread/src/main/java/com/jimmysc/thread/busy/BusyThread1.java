package com.jimmysc.thread.busy;

/**
 * <pre>
 * jimmy
 * 2014��10��17��
 * </pre>
 **/
public class BusyThread1 implements Runnable {

    @Override
    public void run() {
        this.readFileFormRemote();
    }

    private void readFileFormRemote() {
        try {
            Thread.sleep(1 * 24 * 60 * 60 * 1000);
        } catch (InterruptedException e) {
        }
    }
}
