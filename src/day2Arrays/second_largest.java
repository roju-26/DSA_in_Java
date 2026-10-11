package day2Arrays;

public class second_largest {

	public static void main(String[] args) {
	int[] arr= {12,8,5,20,20};
	int largest=arr[0];
	int second_largest=0;
	boolean found_second=false;
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>largest) {
			second_largest=largest;
			largest=arr[i];
			found_second=true;
			}
		else if(arr[i]<largest && (!found_second || arr[i]>second_largest)){
			second_largest=arr[i];
			found_second=true;
		}
		
	}
	if(found_second) {
	    System.out.println("Second largest:" + second_largest);
	}
	
	else {
		System.out.println("NO second largest distinct element found");
		
	}
		

	}

}
