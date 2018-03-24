package com.constructor;
	class Person{
		String name;
		int age;
		Person(String name,int age){
			this.name=name;
			this.age=age;
		}
	}
public class ParentConstructorDemo extends Person {

	 int marks;
	 int rollno;

	ParentConstructorDemo(String name, int age,int marks,int rollno) {
		super(name, age);
		this.marks=marks;
		this.rollno=rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentConstructorDemo ccd=new ParentConstructorDemo("surya", 24,90, 101);
		System.out.println();

	}

}
