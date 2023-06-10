import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = Arrays.copyOf(nums1, m);
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1Copy[i] <= nums2[j]) {
                nums1[k++] = nums1Copy[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }

        while (i < m) {
            nums1[k++] = nums1Copy[i++];
        }

        while (j < n) {
            nums1[k++] = nums2[j++];
        }

        Arrays.sort(nums1);
    }

    public static void runTest(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        int[] nums1Copy = Arrays.copyOf(nums1, nums1.length);

        merge(nums1, m, nums2, n);

        if (Arrays.equals(nums1, expected)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
            System.out.println("Expected: " + Arrays.toString(expected));
            System.out.println("Actual: " + Arrays.toString(nums1Copy));
        }
    }

    public static void main(String[] args) {
        runTest(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6});
        runTest(new int[]{1}, 1, new int[]{}, 0, new int[]{1});
        runTest(new int[]{0}, 0, new int[]{1}, 1, new int[]{1});
        runTest(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3, new int[]{1, 2, 3, 4, 5, 6});
        runTest(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3, new int[]{1, 2, 4, 5, 6, 6});
    }
}

