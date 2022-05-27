package implicite;

public class Implicit_Explicit_Casting 

// primitive 2
    // 1)  implicit
     //2) explicit
{
   // converting lower datatype into bigger data type
	//"widening casting" & "automatically converted"
	// implicit casting format 
	//  byte>>short>>int>>long>>float>>double
	//byte 1     2      4    8    4       8
	
	// implicit 
	  public static void main(String[] args) 
	  {
		int a= 25;
		double b = a;
		System.out.println(b);
		  

	    
	   // explicit 
		// narrowing
	    
	   int  c= -129;          // -32768 ,  , , ,  0 , 1 2, 32767 
       byte d = (byte) c;       //  -32768 
	   System.out.println(d);
	  
	  }
	  
	
}
