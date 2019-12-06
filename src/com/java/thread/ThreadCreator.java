package com.java.thread;


import java.util.concurrent.*;

/**
 *  Shows various ways to create thread
 */
public class ThreadCreator extends  Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                "Created thread by extending java.lang.Thread");
    }

    public static void main(String[] args) throws  Exception{


        //Method 1  Create thread by extending java.lang.Thread
        Thread thread1= new ThreadCreator();
        thread1.start();

        //Method 2  Create thread by implementing Runnable
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+
                        "Created thread using implementing anonymous runnable interface");

            }
        });
        thread2.start();

        //Method 3  Create thread by implementing functional interface Runnable
        Runnable task = ()-> System.out.println(Thread.currentThread().getName()+
                "Created thread using runnable task Java 8 functional interface");

        Thread thread3 = new Thread(task);
        thread3.start();

        // Method 4
        Thread thread4 = new Thread(()-> System.out.println(Thread.currentThread().getName()
                +"Created thread using inline runnable task using Java 8 functional interface"));
        thread4.start();


        // Method 5
        Runnable task2 = ()-> System.out.println(Thread.currentThread().getName() + " Created thread using executor service by passing Runnable functional interface");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(task2);

        // Method 6
        FutureTask<String> future = new FutureTask<String>(()->{
           System.out.println(Thread.currentThread().getName()+ " Created thread using future task by passing Callable functional interface");
           return "returnValue";
        });
        //ExecutorService service = Executors.newSingleThreadExecutor();
        //service.submit()
        Thread t = new Thread(future);
        t.start();
        String returnedValue = future.get();

    }
}
