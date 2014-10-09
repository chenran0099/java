package com.generic;

import java.sql.Date;

// 泛型类
// 类型变量(一般用大写字母) <T>
public class Pair<T> {

  // 类型变量作为局部变量
  private T first;
  private T second;

  public Pair() {
    first = null;
    second = null;
  }

  public Pair(T first, T second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public void setFirst(T first) {
    this.first = first;
  }

  // 作为返回值
  public T getSecond() {
    return second;
  }

  public void setSecond(T second) {
    this.second = second;
  }

  public static void main(String[] args) {

    Pair<String> pair = new Pair<String>("haha", "hehe");

    System.out.println(pair.getFirst());

  }

}


// 集成自泛型类 ， 需要指定T的类型
class DateInterval extends Pair<Date> {

  @Override
  public void setSecond(Date second) {
    if (second.compareTo(getFirst()) >= 0) {
      super.setSecond(second);
    }
  }
}
