
public class LCM {
	private int num;
	
	public int getnum()
	{ return num;}
	
	public void setnum(int n)
	{ num=n;}
	
	public LCM(int num1)
	{
		 num=num1;
	}
	
	public int greatestMultiple(int n)
	{
		return n*(n+1);
	}

	public int getLCM(int n)
	{  int findlcm;
	   findlcm=Math.max(n, num);
	   for (int i=findlcm;i<=n*num;i++)    
	   {
		   if(i%num==0&&i%n==0)
			   return i;
	   }
	   return findlcm;
		
	}
	
	public int getGCD(int n)
	{   int findgcd=0;
	    int i=0;
	    int maxindex=Math.max(n, num);
	    for(i=1;i<=maxindex;i++)
	    { 
	    	if((n%i==0)&&(num%i==0))
	    		findgcd=i;
	    }
	    return findgcd;
	    
	}
	
	public double LCMRatio(int n)
	{   double ratio=0;
	     double lcm=0;
	     lcm=getLCM(n);
	     double gcd=0;
	     gcd=getGCD(n);
	     ratio=lcm/gcd;
	     return ratio;
	}     
	
		
		
	
	
	
	
}
