package MVC;

import java.util.*;

public class MVC {
	public static void main(String[] args) {
//		System.out.println("Input 2 numbers : ");
//	    Scanner input = new Scanner(System.in);
//	    int a = input.nextInt();
//	    int b = input.nextInt();
//	    System.out.println(" A+B = " + (a+b)  
//    	+ ", A-B = " + (a-b) );
		Controller mgr = new Controller();
		mgr.run();
		System.out.println(mgr);
		System.out.println(mgr.toString());
	}
}
