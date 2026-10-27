class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int val = -1;
        int[] arr = new int[2];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                val = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        arr[1] = val;;
        int val1=-1;
        left=0;
        right=nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                val1 = mid;
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        arr[0]=val1;
return arr;
    }
}