package day8BinarySearch;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	
		int[] arr= {20,30,45,64,68,99,101};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched:");
		
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			 int mid=(low+high)/2;
			
		
	        if(arr[mid]==key) {
				System.out.println("element found at:" + mid);
				break;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		
	}
		
		

	}

}
