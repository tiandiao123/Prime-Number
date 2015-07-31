import java.util.Scanner;

public class PrimeTest {
	
	public static void main(String[] args)
	{   Scanner keyboard=new Scanner(System.in);
		int total1=0;  
		//Prime aprimenumber=new Prime(2);
		System.out.println("firstly, I want to know the first prime number:"+Prime.getPrime());
		System.out.println("then I need to know the next 5 prime numbers.");
		for(int i=1;i<=5;i++)
		{
			System.out.print(Prime.getPrime());
			System.out.print(" ");
		}
		
		System.out.println("now, the last prime we have serched is :"+Prime.getprimenumber());
		
		System.out.println("now I want to know next 6 prime numbers and the total of the 6 primes");
		for(int i=1;i<=6;i++)
		{   total1=total1+Prime.getPrime();
		     System.out.println(Prime.getprimenumber()+" ");
			
		}
		System.out.println("now these 6 primenumbers' sum is :"+total1);
		Prime.reset();
		System.out.println("now reset your prime:"+Prime.getPrime());
		
		System.out.println("Now enter a number, then we will set the smallest prime which is >=the number you entered");
		int a=keyboard.nextInt();
		Prime.reset(a);
		System.out.println("so the prime is:"+Prime.getprimenumber());
		
	}
}
