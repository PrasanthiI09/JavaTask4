package javatask4;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int prime = sc.nextInt();
		int count=0;
			
		    for (int i=1;i<=prime;i++) {
			  
			  if(prime%i==0){
				  count++;
			  }
			  		 
		  }
		    if(count==2)
		    {System.out.println(prime +" is a Prime number");}
		    else {
		    	System.out.println(prime + " is not a Prime number");
		    }
	}

}
