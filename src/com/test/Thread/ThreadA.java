package com.test.Thread;

public class ThreadA {

    public static void main(String[] args) {
        ThreadB thread = new ThreadB(); // û���ö�̬
        thread.start();

        System.out.println("thread����start...");
        
        // ͬ�������
        synchronized (thread) {

            try {

                System.out.println("�ȴ�����thread��ɼ��㡣����");

                thread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread���������ܺ��ǣ�" + thread.total);
        }
    }
}