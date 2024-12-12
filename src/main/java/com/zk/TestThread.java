package com.zk;

import javafx.scene.paint.Stop;

/**
 * @author: zk
 * @create 2024-09-22 17:29
 */
//多线程交替打印1-100
public class TestThread implements Runnable{
    int i = 1;
    boolean s = true;
    @Override
    public void run() {
        while (s){
            synchronized (this){
                notify();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i<=100){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    i++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    s = false;
                }
            }
        }
    }


    public static void main(String[] args) {
        final TestThread testThread = new TestThread();
        Thread t1 = new Thread(testThread);
        Thread t2 = new Thread(testThread);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }

}
