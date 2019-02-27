
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data1[] = {};
		int target1 = 9;
		
		int data2[] = {5, 7, 7, 8, 8, 10};
		int target2 = 8;
		

		
		int[] ans1 = BSforARange.searchRange(data1, target1);
		System.out.println("ans1 = [" + ans1[0] +","+ans1[1] + "] VS answer is [-1,-1]");
		
		int[] ans2 = BSforARange.searchRange(data2, target2);
		System.out.println("ans2 = [" + ans2[0] +","+ans2[1] + "] VS answer is [3,4]");

		

	}

}
