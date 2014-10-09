package com.generic;

import java.util.ArrayList;

public class List {

  private static void addall() {
    ArrayList<Manager> mangers = new ArrayList<Manager>();

    for (int i = 0; i < 10; i++) {
      mangers.add(new Manager());
    }

    System.out.println(mangers.size());

    // 添加子类
    for (int i = 0; i < 10; i++) {
      mangers.add(new Employee());
    }

    System.out.println(mangers.size());

  }

  private static void addall2() {
    ArrayList<Employee> employees = new ArrayList<Employee>();

    // 编译错误
    // employees.add(new Manager());
    
    
    int a = 6 / 2 * (1 + 2);
    System.out.println(a);
  }

  private static void testInterface() {
    ArrayList<Score> scores = new ArrayList<Score>();

    scores.add(new Score() { // 实例化借口

          @Override
          public void show() {
            System.out.println(i);
          }
        });

    scores.get(0).show();

  }


  public static void main(String[] args) {

    // addall();

    testInterface();
  }

}


class Manager {
  String name;
}


class Employee extends Manager {
  String sex;
}


interface Score {

  static int i = 1;

  void show();

}
