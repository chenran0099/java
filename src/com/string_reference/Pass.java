package com.string_reference;

public class Pass {

  String a = "123";

  public static void test(Pass passA) { // 传对象
    passA.a = "abc";
    passA = null;
  }

  public static void test2(String str) { // 传字符串
    str = "World";
  }

  public static void test3(StringBuffer str) {
    str.append("World");
  }

  public static void test4(StringBuffer str) {
    str = new StringBuffer("World");; // = 赋值，而不是 append 操作
  }



  public static void main(String[] args) {
    Pass passB = new Pass();
    passB.a = "123";
    System.out.println(passB.a);
    test(passB);
    System.out.println(passB.a);

    //
    String string = "Hello";
    System.out.println(string);
    test2(string);
    System.out.println(string);

    //
    StringBuffer stringBuffer = new StringBuffer("Hello");
    System.out.println(stringBuffer);
    test3(stringBuffer);
    System.out.println(stringBuffer);

    //
    StringBuffer sbBuffer = new StringBuffer("Hello");;
    System.out.println(sbBuffer);;
    test4(sbBuffer);;
    System.out.println(sbBuffer);; // what is it now ?

  }

}
