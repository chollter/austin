package com.java3y.austin.service.api.impl.service;

public class NoPublicDemoTest {

    boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        NoPublicDemoTest demo = new NoPublicDemoTest();
        Thread thread = new Thread(demo.getConcurrencyCheckTask());
        thread.start();

        Thread.sleep(1000L);
        System.out.println("Set stop to true in main!");

        demo.stop = true;
        System.out.println("Exit main.");

    }


    ConcurrencyCheckTask getConcurrencyCheckTask () {
        return new ConcurrencyCheckTask();
    }

    private class ConcurrencyCheckTask implements Runnable {

        @Override
        public void run() {
            System.out.println("ConcurrencyCheckTask started!");


            while (!stop) {

            }
            System.out.println("ConcurrencyCheckTask stop!");

        }
    }


}