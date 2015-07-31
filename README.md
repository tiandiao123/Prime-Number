import java.util.Scanner;


public class PrimeInstTest {
	public static void main(String[] args)
	{   Scanner keyboard=new Scanner(System.in);
		int total1=0;  
		PrimeInst aprime=new PrimeInst();
		
		System.out.println("firstly, I want to know the first prime number:"+aprime.getPrime());
		System.out.println("then I need to know the next 5 prime numbers.");
		for(int i=1;i<=5;i++)
		{
			System.out.print(aprime.getPrime());
			System.out.print(" ");
		}
		
		System.out.println("now, the last prime we have serched is :"+aprime.getprimenumber());
		
		System.out.println("now I want to know next 6 prime numbers and the total of the 6 primes");
		for(int i=1;i<=6;i++)
		{   total1=total1+aprime.getPrime();
		     System.out.println(aprime.getprimenumber()+" ");
			
		}
		System.out.println("now these 6 primenumbers' sum is :"+total1);
		aprime.reset();
		System.out.println("now reset your prime:"+aprime.getPrime());
		
		System.out.println("Now enter a number, then we will set the smallest prime which is >=the number you entered");
		int a=keyboard.nextInt();
		aprime.reset(a);
		System.out.println("so the prime is:"+aprime.getprimenumber());
		
	}
	
}
