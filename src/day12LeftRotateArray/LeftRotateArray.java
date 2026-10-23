package day12LeftRotateArray;

public class LeftRotateArray {

	public static void main(String[] args) {
		int[] arr= {12,13,14,15,16,17};
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println("Array after left rotation:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + "");
		}

	}

}
