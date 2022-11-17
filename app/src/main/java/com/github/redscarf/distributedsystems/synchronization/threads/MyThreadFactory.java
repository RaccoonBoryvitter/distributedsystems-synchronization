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
public class MyThreadFactory {

    private final CompoundCounter counter = new CompoundCounter();
    
    public Thread createMyThread() {
        System.out.println("The memory address of the counter: " + counter);
        return new Thread(new MyThread(counter));
    }
}
