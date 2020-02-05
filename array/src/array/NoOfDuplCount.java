package array;
import java.util.Arrays;
public class NoOfDuplCount {
	private void duplArr(int[] arr, int size) {
		//System.out.println("duplicate no:");
		  int count = 1;
	        Arrays.sort(arr);
	        for (int i = 0; i < size; i++) {
	            for (int j = i + 1; j < size; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }
	            if (count > 1) {
	                System.out.println();
	                System.out.println("repeated element in array " + arr[i] + ": " + count + " time(s)");
	                i = i + count - 1;
	            }else
	                System.out.println("repeated element in array " + arr[i] + ": " + count + " time(s)");
	            count = 1;
	        }
	    }
	public static void main(String[] args) {
		NoOfDuplCount sc = new NoOfDuplCount();
		int[] arr={10,20,30,10,10,20,30,30,40,40,50,60,40,40};
		int size=arr.length;
		sc.duplArr(arr, size);
	}
}
