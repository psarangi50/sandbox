import java.util.Scanner;
public class A3dot3 {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	    System.out.print("Enter a, b, c, d, e, f: ");
	     
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();
	    double d = input.nextDouble();
	    double e = input.nextDouble();
	    double f = input.nextDouble();
	    
	    if( (a * d) - (b * c) == 0 ){
	    	System.out.println("The Equation has no solution");
	    }
	    else {
	    	double x = ((e * d ) - (b * f)) / ((a * d) - (b * c));
	    	double y = ((a * f - e * c)) / ((a * d) - (b * c ));
	    
	    	System.out.print("x is " + x + " and y is " + y);
	    }
	}

}
