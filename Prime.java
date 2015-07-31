
public class Prime {
	private static int primenumber=2;
	private static int counting=0;

	
	public static int getprimenumber()
	{ return primenumber;}
	
	public static boolean isPrime(int p)
	{   if(p==1)
		   return false;
		
	   if(p==2)
		 return true;
	  else
		 for(int i=2;i<p;i++)
		  {   if(p%i==0)
			return false;
			
		   }
	    return true;
	}
	
	public static int getPrime()
	{   if(counting==0)
	      {  counting++;
		    return primenumber;
	      }
	        
	    else
	       {   counting++;
	           primenumber=nextprime();
	       }
	         
	    	return primenumber; 
	      
	}    
		
	   
	
	
	protected static int nextprime()
	{   int i=primenumber+1;
	    for(;i<primenumber+primenumber;i++)
	    {
	    	if(isPrime(i))
	    		break;
	    }
	    return i;
	     
	}
	
	public static void reset()
	{ primenumber=2;
	   counting=0;
	}
	
	public static void reset(int n)
	{
		int i=n;
		for(;i<n*2;i++)
		{
			if(isPrime(i))
		       break;
		}
		primenumber=i;
		if(primenumber==2)
			counting=0;
		else
		{     counting=1;
		   for(int j=3;j<=primenumber;j++)
		   {   if(isPrime(j))
			     counting++;
		   }
		}
	}
	
	public static int sumPrimes(int n)
	{    int total=0;
	     
	     int count=0;
	     for(int i=primenumber+1;count<n;i++)
	     {
	    	 if(isPrime(i))
	    	 {   total=total+i;
	    		 count++;
	    	 }
	    		 
	     }
	     return total;
		
	}
	
	
	

}
