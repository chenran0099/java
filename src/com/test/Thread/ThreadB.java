package com.test.Thread;

public class ThreadB extends Thread {

    int total;

    @Override
    public void run() {
        synchronized (this) {

            for (int i = 0; i < 101; i++) {
                total += i;
            }
            System.out.println("��ɼ���");
            // ����ɼ����ˣ������ڴ˶���������ϵȴ��ĵ����̣߳��ڱ������߳�A������
            notify();

            // ֻҪ����notify()������ζ����ʱ������ÿ��á�
        }
    }

    public int getTotal() {

        return total;
    }
}