
public class BSforARange {

	public static int[] searchRange(int[] nums, int target) {
		int[] target_not_found = {-1, -1};
		

		int first_position = -1;
		int last_position = -1;

		//null array
		if (nums.length == 0)
			return target_not_found;



		//target not in the array
		if (target < nums[0] || target > nums[nums.length - 1])
			return target_not_found;


		//target in the array
		//1. find the first position
		int begin = 0;
		int end = nums.length - 1;
		int mid = 0;

		while (begin + 1 < end) {
			mid = begin + (end - begin)/2;

			if (nums[mid] == target)
				end = mid;
			else if (nums[mid] > target)
				end = mid;
			else if (nums[mid] < target)
				begin = mid;
		}

		if (nums[begin] ==  target)
			first_position = begin;
		else if (nums[end] == target)
			first_position = end;
		else
			return target_not_found;


		//2. find the last position
		begin = 0;
		end = nums.length - 1;
		mid = 0;

		while (begin + 1 < end) {
			mid = begin + (end - begin)/2;

			if (nums[mid] == target)
				begin = mid;
			else if (nums[mid] > target)
				end = mid;
			else if (nums[mid] < target)
				begin = mid;
		}

		if (nums[end] ==  target)
			last_position = end;
		else if (nums[begin] == target)
			last_position = begin;
		else
			return target_not_found;		

		int[] target_position = {first_position, last_position};

		return target_position;
	}

}
