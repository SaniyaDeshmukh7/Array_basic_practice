package array;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		int n, a, res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		n = sc.nextInt();
		while (n != 0) {
			a = n % 10;
			res = (res * 10) + a;
			n = n / 10;
		}
		System.out.println("rev num:" + res);
	}
}
 class RevArray3 {

	public static void main(String[] args) {
		int n, a, res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		n = sc.nextInt();
		for (;n != 0;) {
			a = n % 10;
			res = (res * 10) + a;
			n = n / 10;
		}
		System.out.println("rev num:" + res);
	}
}

class RevARR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num");
		int x = sc.nextInt();
		int r = reverse(x);
		System.out.println("rev num" + r);

	}

	private static int reverse(int x) {
		int  a, res = 0;
		while (x != 0) {
			a = x % 10;
			res = (res * 10) + a;
			x = x / 10;

		}
		return res;
	}

}
class RevARR4 {
	int  a, res = 0;
	  void reverse(int x) {
		if (x != 0) {
			a = x % 10;
			res = (res * 10) + a;
			x = x / 10;
			reverse(x);
		}else
			System.out.println("num"+res);

		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter any num");
			int x1 = sc.nextInt();
			RevARR4 r= new RevARR4();
			r.reverse(x1);
			//System.out.println("rev num" + r);

		}
	}

