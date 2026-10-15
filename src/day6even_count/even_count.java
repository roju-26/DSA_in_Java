package day6even_count;

public class even_count {

	public static void main(String[] args) {
		

		        int[] arr = {2, 5, 8, 3, 10};

		        int count = 0;

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] % 2 == 0) {
		                count++;
		            }
		        }

		        System.out.println("Count of even numbers: " + count);
		    }
		}




