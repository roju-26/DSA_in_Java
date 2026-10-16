package day7Linear_Search;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {25,39,43,27,8};
		
		System.out.println("Enter the element to be searched:");
		int key=sc.nextInt();
		
		int index=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				index=i;
				break;
				
			}
		}
			
			if(index!=-1) {
				System.out.println("Element found at index:" + index);
			}
			
			else {
				System.out.println("element not found");
			}
		
	

	}

	}

