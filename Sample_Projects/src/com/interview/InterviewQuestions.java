package com.interview;

public class InterviewQuestions {
	
	public static void main(String[] args) {
		
		
		double a = 295.04;
		int b = 300;
		byte c = (byte) a;
		byte d = (byte) b;
		System.out.println(c + " " + d);
		boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if ( b1 & b2 | b2 & b3 | b2 ) /* Line 8 */
            System.out.print("ok ");
        if ( b1 & b2 | b2 & b3 | b2 | b1 ) /*Line 10*/
            System.out.println("dokey");
        int x = 100;
        double y = 100.1;
       // boolean b = (x = y); /* Line 7 */
        System.out.println(b);
		
	}
	
}
