package com.java.thread;

public class TestThread1 extends Thread{


    @Override
    public void run() {
        System.out.println("Executing run method of thread "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Executing main method of thread " + Thread.currentThread().getName());
        TestThread1 testThread = new TestThread1();
        testThread.start();
    }
}