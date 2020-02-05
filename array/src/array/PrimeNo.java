package array;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int a=0, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int n= sc.nextInt();
		for (int i = 2; i < n; i++) {
			if(n%i==0){
				count++;
				break;
		}}
		if(count==0){
			System.out.println(" prime no");
		}else

	{
		System.out.println("not prime no");
	}
}}