package day9moveZeroesTotheEnd;

public class ZeroesToTheEnd {
public static void main(String[] args) {
	int index=0;
	int[] arr= {0,5,9,0,4,6,0};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[index]=arr[i];
			index++;
			
		}
	}
	while(index<arr.length) {
		arr[index]=0;
		index++;
		
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
}
}
