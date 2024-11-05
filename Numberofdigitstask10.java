package javatask4;
import java.util.Scanner;


public class Numberofdigitstask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int digit = sc.nextInt();
int count = 0;
System.out.println("Number of Digits in "+digit+" is ");
while(digit!=0)
	{ 
	digit = digit/10;
	count++;
	}
System.out.println(count);
	}

}
