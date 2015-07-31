
public class PrimeInst {
	private  int primenumber;
	private  int counting;

	public PrimeInst()
	{ primenumber=2;
	    counting=0;
	}
	public int getprimenumber()
	{ return primenumber;}
	
	public boolean isPrime(int p)
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
	
	public int getPrime()
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
		
 
    	  
     
	
	
	protected int nextprime()
	{   int i=primenumber+1;
	    for(;i<primenumber+primenumber;i++)
	    {
	    	if(isPrime(i))
	    		break;
	    }
	    return i;
	     
	}
	
	public void reset()
	{ primenumber=2;
	   counting=0;
	}
	
	public  void reset(int n)
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
	
	public int sumPrimes(int n)
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
