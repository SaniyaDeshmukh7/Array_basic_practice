package array;

import java.util.Scanner;
public class MissingNo {

	public static void main(String[] args) {
		int expSum=0,sum=0;
		int mis[]={1,2,3,4,5,6,7,8,9,10,11,12,13,15};
		for (int i=0;i<=mis.length-1;i++) {
			sum=sum+mis[i];
			expSum=(mis[i]*(mis[i]+1))/2;
}
		System.out.println(sum);
		int total = expSum-sum;
		System.out.println("missing no:"+total);
}
}
