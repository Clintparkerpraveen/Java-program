//EXAMPLE OF USING SCANNER 
import java.util.*;
class area{
	 public static void main(String args[]){
	
		//AREA OF RECTANGLE 

		Scanner length = new Scanner(System.in); 
		System.out.println("Enter the length of rectangle:");
		int l=length.nextInt();
		Scanner width = new Scanner(System.in);
		System.out.println("Enter the breadth of rectangle:");
		int b=width.nextInt();
		System.out.println("Area of rectangle="+l*b);
	
		System.out.println(""); //JUST AN EMPTY LINE 
		//AREA OF CIRCLE 

		Scanner radius = new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double r=radius.nextDouble();
		System.out.println("area of circle="+3.14*r*r);
	}
	 
}
