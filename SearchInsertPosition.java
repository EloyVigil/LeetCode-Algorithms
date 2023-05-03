public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (target < nums[0]) {
            return 0;
        } else if (target > nums[end]) {
            return end + 1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        int result = searchInsert(nums, target);
        System.out.println(result == expected ? "PASS" : "FAIL");
    }
}
