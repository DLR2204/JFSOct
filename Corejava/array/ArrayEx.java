package array;

public class ArrayEx {

	public static void main(String[] args) {
		
		int arrname1[] = { 1, 2, 3, 4, 5, 6, 67, 7, 8, 9, 4 };

		int arrname2[] = new int[] { 1, 2, 3, 4, 5, 5, 6, 7, 7, 7 };

		int arrname3[] = new int[10];

		arrname3[0] = 23;
		
		
		for(int i = 0 ;i<arrname2.length;i++) {
			System.out.println(arrname1[i]);
		}
		
		
	}
}
