package com.xzy.test;

import javax.sound.midi.Sequence;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @description:
 * @author: xzy
 * @date: 2023/9/4 14:58
 **/
public class ThreadTest {

    static int a = 0;
    static BlockingQueue<Thread> tasks = new LinkedBlockingQueue<>();
    static BlockingQueue<Runnable> workers = new LinkedBlockingQueue<>();
    static List<Thread> threadList = new ArrayList<>();
    static CountDownLatch countDownLatch = new CountDownLatch(1);
    /**
     * 用于判断线程一是否执行，倒计时设置为1，执行后减1
     */
    private static final CountDownLatch c1 = new CountDownLatch(1);
    /**
     * 用于判断线程二是否执行，倒计时设置为1，执行后减1
     */
    private static final CountDownLatch c2 = new CountDownLatch(1);
    private static Object myLock1 = new Object();
    private static Object myLock2 = new Object();

    /**
     * 为什么要加这两个标识状态?
     * 如果没有状态标识，当t1已经运行完了t2才运行，t2在等待t1唤醒导致t2永远处于等待状态
     */
    private static Boolean t1Run = false;
    private static Boolean t2Run = false;

    private static Semaphore semaphore = new Semaphore(1);

    static Executor poolExecutor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws InterruptedException {
//        joinTest();
//        countDownLatchTest();
//        singleThreadPoolTest();
//        CompletableFutureTest();
//        waitTest();
        semaphoreTest();
    }


//   顺序执行
//      1.join
//    2. CountDownLatch提供两个核心的方法，countDown和await
//    3.利用 newSingleThreadExecutor 控制线程的执行顺序
//    4.CompletableFuture实现了多个线程顺序执行的问题
//    5.封装aqs自己实现线程顺序执行

    private static void joinTest() {
        for (int i = 0; i < 10; i++) {
            Thread task = new Thread(() ->
            {
                a = ++a;
                System.out.println("current thread:" + Thread.currentThread().getName() + ",a:" + a);
            });
            tasks.add(task);
        }

        while (!tasks.isEmpty()) {
            Thread thread = null;
            try {
                thread = tasks.take();
                thread.start();
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void countDownLatchTest() {
        final Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "执行");
            //对c1倒计时-1
            c1.countDown();
        },"t1");

        final Thread thread2 = new Thread(() -> {
            try {
                //等待c1倒计时，计时为0则往下运行
                c1.await();
                System.out.println(Thread.currentThread().getName() + "执行");
                //对c2倒计时-1
                c2.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2");

        Thread thread3 = new Thread(() -> {
            try {
                //等待c2倒计时，计时为0则往下运行
                c2.await();
                System.out.println(Thread.currentThread().getName() + "执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t3");

        thread3.start();
        thread1.start();
        thread2.start();

    }

    private static void singleThreadPoolTest() {
        for (int i = 0; i < 10; i++) {
            Runnable task = () -> {
                a = ++a;
                System.out.println("current thread:" + Thread.currentThread().getName() + ",a:" + a);
            };
            workers.add(task);
        }

        while (!workers.isEmpty()) {
            Runnable task = null;

            try {
                task = workers.take();
                poolExecutor.execute(task);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void CompletableFutureTest() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Runnable task = () -> {
                a = ++a;
                System.out.println("current thread:" + Thread.currentThread().getName() + ",a:" + a);
            };
            workers.add(task);
        }

        Runnable work = workers.take();
        Runnable work2 = workers.take();
        Runnable work3 = workers.take();
        Runnable work4 = workers.take();
        CompletableFuture.runAsync(work)
                .thenRun(work2)
                .thenRun(work3)
                .thenRun(work4);
        System.out.println("end");
    }

    private static void waitTest() {
        final Thread thread1 = new Thread(() -> {
            synchronized (myLock1) {
                System.out.println(Thread.currentThread().getName() + "执行");
                t1Run = true;
                myLock1.notify();
            }
        }, "t1");

        final Thread thread2 = new Thread(() -> {
            synchronized (myLock1) {
                try {
                    if (!t1Run) {
                        System.out.println("t2先休息会...");
                        myLock1.wait();
                    }
                    synchronized (myLock2) {
                        System.out.println(Thread.currentThread().getName() + "执行");
                        t2Run = true;
                        myLock2.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t2");

        Thread thread3 = new Thread(() -> {
            synchronized (myLock2) {
                try {
                    if (!t2Run) {
                        System.out.println("t3先休息会...");
                        myLock2.wait();
                    }
                    System.out.println(Thread.currentThread().getName() + "执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t3");

        thread2.start();
        thread1.start();
        thread3.start();
    }

    private static void semaphoreTest() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread task = new Thread(() ->
            {
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a = ++a;
                System.out.println("current thread:" + Thread.currentThread().getName() + ",a:" + a);
                semaphore.release();
            });
            tasks.add(task);
        }

        while (!tasks.isEmpty()) {
            Thread thread = null;
            try {
                thread = tasks.take();
                thread.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
