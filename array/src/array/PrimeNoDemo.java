package array;

import java.util.Scanner;

public class PrimeNoDemo {

	public static void main(String[] args) {
		boolean prime= true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no to check it is prime or not");
		Integer in=sc.nextInt();
		for (int i = 2; i < in; i++) {
			if(in%i==0){
				prime = false;
				break;
			}}	
			if (prime==true){
				System.out.println("given no is prime");
			}else
				System.out.println("not prime no");

			
		}
	}


