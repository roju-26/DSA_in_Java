package day10RemovingDuplicates;

public class RemovingDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,2,2,4,6,5,7,7,8,7};
		System.out.println(arr[0]+" ");
		
		for(int i=1;i<arr.length;i++) {
			boolean duplicate=false;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
					break;
				}
			}
			
			if(!duplicate) {
				System.out.println(arr[i]+" ");
			}
		}
		
		

	}

}
