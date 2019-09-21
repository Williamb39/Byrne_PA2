import java.util.*;

public class bmi {

public static void main(String[] args) 
  {
	Scanner scnr = new Scanner(System.in);
	double bmi1 = person(scnr);
	report(bmi1);
  }

public static double person(Scanner console) 
  {
	System.out.print("Your weight - in pounds? ");
	double weight = console.nextDouble();
	System.out.print("Your height - in inches? ");
    double height = console.nextDouble();
    System.out.println();
    return bmi(height, weight);
  }

public static double bmi(double height, double weight) 
   {
	return (weight * 703 / height / height);
   }

public static void report(double bmi) 
  {
	System.out.printf("Your BMI is = %f\n",bmi);
	  if (bmi < 18.5) 
	   {
		System.out.println("You are underweight.");
	   } 
	     else if (bmi < 25)
	       {
	    	System.out.println("You are normal weight.");
	       } 
	          else if (bmi < 30) 
	           {
	            System.out.println("You are overweight.");
	           } 
	             else 
	             {
	               System.out.println("You are obese.");
	              }
   }
 }


