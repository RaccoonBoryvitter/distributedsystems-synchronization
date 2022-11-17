/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.synchronization.counters;

/**
 *
 * @author Pavlo
 */
public class CompoundCounter {

    private int firstCounter = 0;
    private int secondCounter = 0;

    private final Object locker = new Object(); // just for locking

    public void increment() throws InterruptedException {
        synchronized(locker) {
            Thread.sleep(150);
            firstCounter++;
            secondCounter++;
        }
    }

    public void decrement() throws InterruptedException {
        synchronized(locker) {
            Thread.sleep(150);
            firstCounter--;
            secondCounter--;
        }
    }

    public int getFirstCounterValue() {
        return firstCounter;
    }
    
    public int getSecondCounterValue() {
        return firstCounter;
    }

}
