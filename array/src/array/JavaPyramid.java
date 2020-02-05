package array;

import java.util.Scanner;

public class JavaPyramid {

	public static void main(String[] args) {
		System.out.println("enter no of rows");
		Scanner sc = new Scanner(System.in);
		Integer n= sc.nextInt();
		for(int i=n;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
		System.out.println(" ");

	}
	}
}
