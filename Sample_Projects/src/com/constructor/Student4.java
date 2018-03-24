package com.constructor;

public class Student4 {
	  int id;  
	    String name;  
	      
	    Student4(int i,String n){  
	    id = i;  
	    name = n;  
	    } 
	   // void display(){System.out.println(id+" "+name);}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Student4 s1 = new Student4(111,"Karan");  
		    Student4 s2 = new Student4(222,"Aryan");  
		   System.out.println(s1.id+" "+s1.name);
		   int randomPIN=0;
			//for(int i = 0; i < 4; i++)
			   // strNum = strNum + arNumber.get(new Random().nextInt(10));
				 randomPIN = (int)(Math.random()*9000)+1000;
				 System.out.println(randomPIN);
				 String empid="EMP";
				 empid=empid+randomPIN;
				 System.out.println(empid);
	}

}
