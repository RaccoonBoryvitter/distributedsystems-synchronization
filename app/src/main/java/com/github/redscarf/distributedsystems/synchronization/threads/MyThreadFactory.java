/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.synchronization.threads;

import com.github.redscarf.distributedsystems.synchronization.counters.CompoundCounter;

/**
 *
 * @author Pavlo
 */
public class MyThreadFactory {

    private final CompoundCounter counter = new CompoundCounter();
    
    public Thread createMyThread() {
        System.out.println("Counter: " + counter);
        return new Thread(new MyThread(counter));
    }
}
