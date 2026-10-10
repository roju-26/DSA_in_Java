package day1Arrays;

public class Array_Basics {

	public static void main(String[] args) {
		int[] marks= {85,90,95,89};
		System.out.println("total students:" + marks.length);
		
		int highest=marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]>highest) {
				highest=marks[i];
			}
		}
		System.out.println("highest marks:" + highest);

	}

}
