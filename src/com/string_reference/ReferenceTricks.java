package com.string_reference;

public class ReferenceTricks {

  public int i;

  private static void changeReference(ReferenceTricks r) {
    r = new ReferenceTricks();
    r.i = 5;
    System.out.println("In changeReference: " + r.i);
  }

  private static void changeInteger(ReferenceTricks r) {
    r.i = 5;
    System.out.println("In changeInteger:" + r.i);
  }

  public static void main(String[] args) {

    ReferenceTricks r = new ReferenceTricks();

    // reset integer
    r.i = 0;
    System.out.println("Before changeInteger:" + r.i);     // 0
    changeInteger(r);                                      // 5
    System.out.println("After changeInteger:" + r.i);      // 5

    // just for format
    System.out.println();

    // reset integer
    r.i = 0;
    System.out.println("Before changeReference:" + r.i);   // 0
    changeReference(r);                                    // 5
    System.out.println("After changeReference:" + r.i);    // 0
  }



}
