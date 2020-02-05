package array;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int fact=1;
		System.out.println("enter any no");
		Scanner sc = new Scanner(System.in);
		Integer n= sc.nextInt();
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("factorial:"+fact);
	}

}
