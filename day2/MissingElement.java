package week1.day2;
import java.util.Arrays;
public class MissingElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(i!=arr[i]) {
				System.out.println("The Missing Element is "+i);
				break;
				}
		}
	}

}