package oop.thread;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        }).start();



        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        }).start();


        /*MyRunClass myRunClass = new MyRunClass();
        myRunClass.setName("T1");
        Thread thread = new Thread(myRunClass);
        thread.start();


        MyRunClass myRunClass1 = new MyRunClass();
        myRunClass1.setName("T2");
        Thread thread1 = new Thread(myRunClass1);
        thread1.start();
*/


       /* MyThreadClass myThreadClass = new MyThreadClass();
        myThreadClass.start();
        try {
            myThreadClass.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        MyThreadClass myThreadClass1 = new MyThreadClass();
        myThreadClass1.start();

        MyThreadClass myThreadClass2 = new MyThreadClass();
        myThreadClass2.start();*/
    }
}
