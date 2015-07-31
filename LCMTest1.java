//import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Scanner;
public class LCMTest1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		 Scanner keyboard=new Scanner(System.in);
   	  LCM variablelcm=new LCM(45);
   	  System.out.println("please enter a number so that we can find the lcm and gcd of the number you enter and 45");
   	  int a=keyboard.nextInt();
   	  System.out.println("so the lcm is:"+variablelcm.getLCM(a));
   	  System.out.println("so the GCD is:"+variablelcm.getGCD(a));
   	  
   	  System.out.println("let's find the lcm and gcd for any two positive integers");
   	  System.out.println("please enter two positive integers.");
   	  System.out.print("the first one:");
   	  int num1=keyboard.nextInt();
   	  variablelcm.setnum(num1);
   	  System.out.print("the second one:");
   	  a=keyboard.nextInt();
   	  System.out.println("the new lcm :"+variablelcm.getLCM(a)+". The new gcd is: "+variablelcm.getGCD(a));
   	  
   	  System.out.println("the ratio between the lcm and the gcd of the two numbers is:"+variablelcm.LCMRatio(a));
		
	}

}
