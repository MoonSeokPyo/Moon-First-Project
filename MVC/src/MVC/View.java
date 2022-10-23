package MVC;

import java.util.*;

public class View {
	void getInput(Model model) {
		System.out.println("Input 2 numbers : ");
	    Scanner input = new Scanner(System.in);
	    int a = input.nextInt();
	    int b = input.nextInt();
	    model.setAB(a,b);
	    input.close();
	}
	void outputResult(int addValue, int subValue) {
		System.out.println(" A+B = " + addValue  
		    	+ ", A-B = " + subValue );
	}
}
