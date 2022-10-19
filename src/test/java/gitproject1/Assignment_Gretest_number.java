package gitproject1;

import java.util.Scanner;

public class Assignment_Gretest_number {
	public static void main(String[] args) {
 	   try (Scanner sc = new Scanner(System.in)) {
 	System.out.println("enter first number");
 	int num1=sc.nextInt();
 	System.out.println("enter second number");
 	int num2=sc.nextInt();
 	System.out.println("enter third number");
 	int num3=sc.nextInt();
 	if(num1>num2 && num1>num3) {
 		System.out.println("first number is gretest");
 	}else if(num2>num3 && num2>num1) {
 		System.out.println("second number is gretest");
 	  } else if (num3>num1 && num3>num2){
 		  System.out.println("third number is gretest");
  }
 }	    	    
}

}
