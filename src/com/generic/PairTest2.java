package com.generic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PairTest2 {

  public static void main(String[] args) {

    GregorianCalendar[] birthday =
        {new GregorianCalendar(1960, Calendar.DECEMBER, 9),
            new GregorianCalendar(1815, Calendar.DECEMBER, 10),
            new GregorianCalendar(1903, Calendar.DECEMBER, 3),
            new GregorianCalendar(1910, Calendar.JUNE, 22)};

    // Pair<GregorianCalendar> pair = ArrayAlg2.minmax(birthday);

  }

}


class ArrayAlg2 {

  public static <T extends Comparable<T>> Pair<T> minmax(T[] a) {

    if (a == null || a.length == 0) {
      return null;
    }

    T min = a[0];
    T max = a[0];

    for (int i = 0; i < a.length; i++) {

      // 这里使用类型T的只有compareTo属性

      if (min.compareTo(a[i]) > 0) {
        min = a[i];
      }
      if (max.compareTo(a[i]) < 0) {
        max = a[i];
      }
    }

    return new Pair<T>(min, max);
  }
}
