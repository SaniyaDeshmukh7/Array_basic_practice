package array;

import java.util.Arrays;
import java.util.Collections;

public class AscDesc {

	public static void main(String[] args) {
		Integer AscDes[] ={1,9,5,6};
		System.out.println("after ascending sort");
		Arrays.sort(AscDes);
		for (Integer i : AscDes) {
			System.out.println(i);
		}
		System.out.println("after descending sort");
		Arrays.sort(AscDes, Collections.reverseOrder());
		for (Integer i : AscDes) {
			System.out.println(i);
		}
	}

}
