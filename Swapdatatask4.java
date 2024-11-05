package javatask4;
import java.util.Scanner;

public class Swapdatatask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int swap;
		System.out.println("Before Swap");	
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		
		System.out.println("After Swap");	
		swap = a;
		a = b;
		b = swap;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		
		
	}

}
