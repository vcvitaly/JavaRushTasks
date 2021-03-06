package com.javarush.task.task25.task2512;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.LinkedList;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler, Runnable {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        /*e.printStackTrace();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();*/

        t.interrupt();
        LinkedList<Throwable> throwables = new LinkedList<>();
        while (e != null) {
            throwables.add(0, e);
            e = e.getCause();
        }
//        Collections.reverse(throwables);
        for (Throwable throwable : throwables) {
            System.out.println(throwable);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Thread t = new Thread(solution);
        t.setUncaughtExceptionHandler(solution);
        t.start();
    }

    @Override
    public void run() {
        throw new RuntimeException("A", new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
