package org.example.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Smain {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        List<Future<ThreadSafeSingleton>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Future<ThreadSafeSingleton> future = ex.submit(() -> ThreadSafeSingleton.getInstance());
            futures.add(future);
        }
        // Wait for all threads to complete and print their results
        for (int i = 0; i < futures.size(); i++) {
            try {
                ThreadSafeSingleton singletonInstance = futures.get(i).get();
                System.out.println("Thread " + i + " got Singleton Instance: " + singletonInstance);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor
        ex.shutdown();


//        ExecutorService ex = Executors.newFixedThreadPool(5);
//        List<Future<Singleton>> futures = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            Future<Singleton> future = ex.submit(() -> Singleton.getInstance());
//            futures.add(future);
//        }
//        // Wait for all threads to complete and print their results
//        for (int i = 0; i < futures.size(); i++) {
//            try {
//                Singleton singletonInstance = futures.get(i).get();
//                System.out.println("Thread " + i + " got Singleton Instance: " + singletonInstance);
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//
//        // Shutdown the executor
//        ex.shutdown();
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//
//        System.out.println(singleton1);
//        System.out.println(singleton2);
    }
}
