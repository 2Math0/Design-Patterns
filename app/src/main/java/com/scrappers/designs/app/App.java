package com.scrappers.designs.app;

import com.scrappers.designs.Singleton;

/**
 * Sample application to test concrete design patterns implementations. 
 * 
 * @author pavl_g
 */
public class App {
    
    private static void testSingleton() {
        final Singleton object0 = Singleton.getInstance();
        final Singleton object1 = Singleton.getInstance();
        System.out.printf("Are the same: %b", object0 == object1);
    }
    
    public static void main(String[] args) {
        testSingleton();
    }
}
