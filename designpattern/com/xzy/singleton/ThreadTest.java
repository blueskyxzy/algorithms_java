package com.xzy.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * Created by xzy on 18/6/20  .
 */

public class ThreadTest {

    public static void  main(String[] args ) throws Exception {

        long start = System.currentTimeMillis(); // 毫秒
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int j=0;j<10000;j++){
//                        Object instance1 = SingletonLHS.getInstance();
                        Object instance2 = SingletonEHS.getInstance();
//                        Object instance3 = SingletonSNC.getInstance();
//                        Object instance4 = SingletonEnum.Instance;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();

        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end-start));
    }
}
