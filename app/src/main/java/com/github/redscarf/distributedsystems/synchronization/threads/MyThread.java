/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.synchronization.threads;

import com.github.redscarf.distributedsystems.synchronization.counters.CompoundCounter;
import com.github.redscarf.distributedsystems.synchronization.counters.Counter;

/**
 *
 * @author Pavlo
 */
public class MyThread implements Runnable {

    private final CompoundCounter counter;
    private String threadName;
    private long threadId;

    public MyThread(CompoundCounter counter) {
        this.counter = counter;
    }

    private void executeCounter() {
        try {
            System.out.println("Incrementing in the thread \""
                + threadName + "\" (ID: " + threadId + ")");
            counter.increment();
        } catch (InterruptedException ex) {
            System.out.println("Interruption Exception is thrown in the thread \""
                    + threadName + "\" (ID: " + threadId + ")");
            ex.printStackTrace();
        }

        System.out.println("First value counter after increment: " 
                + counter.getFirstCounterValue() + " (name: \"" 
                + threadName + "\", id: " + threadId + ")");
        
        System.out.println("Second value counter after increment: " 
                + counter.getFirstCounterValue() + " (name: \"" 
                + threadName + "\", id: " + threadId + ")");
    }

    @Override
    public void run() {
        this.threadName = Thread.currentThread().getName();
        this.threadId = Thread.currentThread().getId();
        
        System.out.println("Started work in the thread \""
                + threadName + "\" (ID: " + threadId + ")");

        executeCounter();

        System.out.println("Work in the thread \""
                + threadName + "\" (ID: " + threadId + ") is finished.");
    }

}
