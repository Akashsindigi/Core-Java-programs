package Stings;

public class Stings_Buffer_pgm {

	public static void main(String[] args) {
	      StringBuffer b=new StringBuffer("HELLO");
	      // Append function
	      b.append("AKASH");
	      System.out.println(b);
	      
	      //insert function
	      b.insert(5, "Mr");
	      System.out.println(b);
	      
	     //Replace the function
	      b.replace(3, 4, "HI");
	      System.out.println(b);
	      
	      //Delete the wrd
	      b.deleteCharAt(4);
	      System.out.println(b);
	      
	      //Reverse the function
	      b.reverse();
	      System.out.println(b);

	}

}