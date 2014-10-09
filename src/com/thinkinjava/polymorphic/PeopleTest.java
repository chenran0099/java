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

	// 重载父类方法
	public void breath(int i) {
		System.out.println("重载");
	}
}

public class PeopleTest {

	public static void main(String[] args) {

		// 测试多态和覆盖

		// 多态，只能使用基类中的方法和成员

		People people = new People();
		People student = new Student();
		People teacher = new Teacher();

		people.eat();
		System.out.println("--");
		student.eat();
		System.out.println("--");
		teacher.eat();

		// 不使用多态,就可以使用子类中新的方法了

		Student mStudent = new Student();
		mStudent.speak();

		// 子类没有继承 直接调用父类方法
		people.breath();
		student.breath();
		teacher.breath();

		// 多态的时候还是可以判断子类类型的

		System.out.println(people instanceof People);
		System.out.println(student instanceof Student);
		System.out.println(teacher instanceof Student);

	}
}
