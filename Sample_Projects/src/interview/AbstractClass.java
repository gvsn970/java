package interview;

/*abstract class Person1{
	String name;
	int age;
}
*/

//====================with out Constror in================

abstract class Person1{
	String name;
	int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
}

class Student1 extends Person1{
	int roolno;
	int marks;
	Student1(String name,int age,int roolno, int marks){
	super(name,age);
		this.roolno=roolno;
		this.marks=marks;
		
	}
} 
class Teacher extends Person1{
	
	double sal;
	String sub;
	
	Teacher(String name,int age,double sal,String sub){
		super(name,age);
		this.sal=sal;
		this.sub=sub;
	}
}
public class AbstractClass {
	
	public static void main(String[] args) {
		
		Student1 s=new Student1("durga1",31,101,90);
		System.out.println(s.age);
		System.out.println(s.name);
		
		Teacher t=new Teacher("Surya",25,102,"java");
		System.out.println(t.sub);
	}

}
