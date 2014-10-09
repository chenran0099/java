package com.generic;

import java.sql.Date;

// ������
// ���ͱ���(һ���ô�д��ĸ) <T>
public class Pair<T> {

  // ���ͱ�����Ϊ�ֲ�����
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

  // ��Ϊ����ֵ
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


// �����Է����� �� ��Ҫָ��T������
class DateInterval extends Pair<Date> {

  @Override
  public void setSecond(Date second) {
    if (second.compareTo(getFirst()) >= 0) {
      super.setSecond(second);
    }
  }
}
