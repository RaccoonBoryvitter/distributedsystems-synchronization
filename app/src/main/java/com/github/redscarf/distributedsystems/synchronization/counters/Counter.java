/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.synchronization.counters;

/**
 *
 * @author Pavlo
 */
public class Counter {

    private int value = 0;

    public synchronized void increment() throws InterruptedException {
        int a;
        Thread.sleep(150);
        a = value;
        a++;
        value = a;
    }

    public synchronized void decrement() throws InterruptedException {
        int a;
        Thread.sleep(100);
        a = value;
        a--;
        value = a;
    }

    public int getValue() {
        return value;
    }

}
