public class RomanNumeral{
    private int number;
    private String Romannumeral;
    public static final int defaultnumber=-100;
    
    public RomanNumeral(int integerValue)
    { number=integerValue;
         Romannumeral="XIII";
    }
    
    public RomanNumeral(int a,String b)
    {    number=a;
       Romannumeral=b;
    }
    
    public void setnumber(int a)
    { 
          number=a;
     }     
        
   
    
    
    public void setRomannumeral(String a)
    {  Romannumeral=a;}
    
    public int getnumber()
    { return number;}
    
    public String getRomannumeral()
    { return Romannumeral;}
        
    public int compareTo(RomanNumeral r) 
    {
        if(number==r.getnumber())
            return 0;
        
        if (number<r.getnumber())
             return -1;
        
        if (number>r.getnumber())
             return 1; 
         return defaultnumber; 
    }
    
    public int toInt()
    {   String str;
        String strhelp;
        str=Romannumeral;

        int total=0;
        strhelp="MMD";
        if(str.equals(strhelp))
        {
        	str=str.substring(3);
        	total=2500;
        	return total;
        }
        if (str.length()!=0)
        {  while(str.charAt(0)=='M')
           {   
        	total+=1000;
        	
        	if(str.length()>1)
        	str=str.substring(1);
        	else	
        	return total;
        	
            }
        }
        if(str.length()!=0)
        {
             if(str.charAt(0)=='D')
              { total=total+500;
                
               if(str.length()>1)
              str=str.substring(1);
               else
        	    return total;
              }
        }
        if(str.length()!=0)
        {
            while(str.charAt(0)=='C')
            {     total=total+100;
                 
                if(str.length()>1)
                str=str.substring(1);
                else
            	  return total;
        	
            }
        }
         
        strhelp="XCIX";
        if(str.equals(strhelp))
        { total+=99;
            return total;
        }
                                                                                       
        if(str.length()!=0)
        {
           if(str.charAt(0)=='L')
           {
        	total+=50;
        	
        	if (str.length()>1)
        	 str=str.substring(1);
        	else
        		return total;
           }
        }
        
        if(str.length()!=0)
        {
           while(str.charAt(0)=='X')
           {   total+=10;
              
              if(str.length()>1)
            	  str=str.substring(1);
              else
            	return total;
            }
        }
        
        strhelp="IX";
        if(str.equals(strhelp))
        {   total=total+9;
           return total;
        	
        }
        
        if(str.length()!=0)
        {
          if(str.charAt(0)=='V')
          {  total=total+5;
             if(str.length()>1)
            str=str.substring(1);
             else
            	 return total;
            
          }
        }
        
        strhelp="IV";
        
        if(str.equals(strhelp))
        {  total=total+4;
           return total;
        	
        }
        
        if(str.length()!=0)
        {
            while(str.charAt(0) == 'I')
             {
        	   total+=1;
        	    
        	   if (str.length() >1)
        		  str=str.substring(1);
        	   else
        	      return total;
        		
        	
             }
        }
        
        
    	return total;
    }
     
    
    public int outputInt()
     {  int a=0;
        switch (Romannumeral)
        { case "I": a=1;
              break;
          case "II":a=2;
                break;
         case "III": a=3;
               break;
        case "IV": a=4;
            break;
        case "V": a=5;
               break;
        case "VI": a=6;
               break;
        case "VII": a=7;
                break;
        case "VIII": a=8;
             break;
        case "IX": a=9;
             break;
        case "X": a=10;
             break;
        default:
             break;
        
        }
        
        return a;
            
     }
    
    public void outputRoman()
    {
        int a;
       a=number;
       
       if(a==2500)
          { System.out.print("MMD");
             a=a-2500;
          }
       
       while(a>=1000&&a<2500)
       {   System.out.print("M");
           a=a-1000;
       }
       
       if(a>=500&&a<1000)
       {System.out.print("D");
           a=a-500;
       }
      
       while(a>=100&&a<500)
       {System.out.print("C");
          a=a-100;
        }    
        
      
      if(a>=50&&a<100)
      {
          if(a!=99)
            { System.out.print("L");
               a=a-50;
            }
        else
         { System.out.print("XCIX");
             a=0;
         }
      }
      
      while(a>=10&&a<50)
        { System.out.print("X");
            a=a-10;
        }
        
        System.out.println(toString());
    }
    
    public String toString()
    {  
    	
    	String str="undefined";
         int a=number%10;
         
         switch (a)
          { 
            case 1: str="I";
              break;
            case 2: str="II";
              break;
            case 3: str="III";
              break;
            case 4:  str="IV";
              break;
            case 5: str="V";
               break;
            case 6: str="VI";
                break;
            case 7: str="VII";
               break;
            case 8:  str="VIII";
               break;
            case 9:  str="IX";
                  break;
             }
      
        return str;
   }
            
           
     
}
