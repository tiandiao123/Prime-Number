import java.util.Scanner;

public class RomanNumeralTest1 {
	
	 public static void main(String[] args){
         Scanner keyboard=new Scanner(System.in);
         //String str1="XCIX";
        RomanNumeral aRoman=new RomanNumeral(7);
        System.out.println("the original Roman number:");
        aRoman.outputRoman();
        
        System.out.println("let's change another number,please enter a number<=2500");
        int changenumber=keyboard.nextInt();
        aRoman.setnumber(changenumber);
        System.out.println("the new Roman numberal expression:");
        aRoman.outputRoman();
        
        //System.out.println(aRoman.getRomannumeral());
        System.out.println("please enter a string using romannumeral:");
        String str1=keyboard.next();
        aRoman.setRomannumeral(str1);
        System.out.println("so your romannumeral can be written as "+aRoman.toInt()+" using Arabic number");
        
        
        
        
     }

}
