package com.constructor;

class P
{
	 public void properties(){
		 System.out.println("Laon + gold");
	 }
	 public void marry(){
		 System.out.println("subaLaxmi+ lacmi");
	 }
}
	 class C1 extends P{
		 public void marry(){
			 System.out.println("3sha+9tara");
		 }
	 }
  
public class OverRiding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			P p=new P();
			p.marry();
			P c=new C1();
			c.marry();
			C1 c1=new C1();
					c1.properties();
					c1.marry();
	}


 }
