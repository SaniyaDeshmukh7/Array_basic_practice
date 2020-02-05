package array;

public class LargeMin {

	public static void main(String[] args) {  
		int[] intArr=new int[]{8,6,92356,256,34,78};
		int smallestno = Integer.MAX_VALUE;
		int largestno= Integer.MIN_VALUE;
		for (int i : intArr) {
			if(i>largestno){
				largestno=i;
			}}
			System.out.println("largest no in array"+largestno);
		for (int i : intArr) {
			if(i<smallestno){
				smallestno=i;
			}}
		System.out.println("smallest no in array"+smallestno);

	

	}}
