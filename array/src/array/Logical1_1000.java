package array;

public class Logical1_1000 {

	public static void main(String[] args) {

		int temp = 0,ctr=0;
		for(int i = 1;i<=1000;i++){
			ctr=ctr+1;
			if(ctr==100){
				System.out.println("limit crossed");
				ctr=temp;
			}else{
				System.out.println(i);
			}}}
}