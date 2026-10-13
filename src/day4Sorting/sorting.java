package day4Sorting;

public class sorting {

	public static void main(String[] args) {
		int[] marks= {1,2,3,4,5};
		
		boolean sorted = true;
		
		for(int i=1;i<marks.length-1;i++) {
			if(marks[i]>marks[i+1]) {
				sorted = false;
				break;
			}
		}
		if(sorted) {
			System.out.println("Sorted");
			}
		else
		{
			System.out.println("Not sorted");
		}

	}

}
