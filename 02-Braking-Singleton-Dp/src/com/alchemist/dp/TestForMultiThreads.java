package com.alchemist.dp;

public class TestForMultiThreads extends Thread {

    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() 
                + " => " + s.hashCode());
    }

    public static void main(String[] args) {
        TestForMultiThreads t1 = new TestForMultiThreads();
        TestForMultiThreads t2 = new TestForMultiThreads();

        t1.setName("Thread_1");
        t2.setName("Thread_2");

        t1.start();
        t2.start();
    }
}

