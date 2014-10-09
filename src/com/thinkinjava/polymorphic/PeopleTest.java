package com.thinkinjava.polymorphic;

class People {

	public void eat() {
		System.out.println("People eat()");
	}

	public void breath() {
		System.out.println("People breath()");
	}

}

class Student extends People {

	@Override
	public void eat() {
		// super.eat();
		System.out.println("Student eat()");
	}

	public void speak() {
		System.out.println("Student speak()");
	}

}

class Teacher extends People {
	@Override
	public void eat() {
		// super.eat();
		System.out.println("Teacher eat()");
	}

	// ���ظ��෽��
	public void breath(int i) {
		System.out.println("����");
	}
}

public class PeopleTest {

	public static void main(String[] args) {

		// ���Զ�̬�͸���

		// ��̬��ֻ��ʹ�û����еķ����ͳ�Ա

		People people = new People();
		People student = new Student();
		People teacher = new Teacher();

		people.eat();
		System.out.println("--");
		student.eat();
		System.out.println("--");
		teacher.eat();

		// ��ʹ�ö�̬,�Ϳ���ʹ���������µķ�����

		Student mStudent = new Student();
		mStudent.speak();

		// ����û�м̳� ֱ�ӵ��ø��෽��
		people.breath();
		student.breath();
		teacher.breath();

		// ��̬��ʱ���ǿ����ж��������͵�

		System.out.println(people instanceof People);
		System.out.println(student instanceof Student);
		System.out.println(teacher instanceof Student);

	}
}
