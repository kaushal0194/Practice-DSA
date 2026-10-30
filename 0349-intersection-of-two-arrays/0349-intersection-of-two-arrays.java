class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int[] arr = new int[nums1.length + nums2.length];
        int top = 0;
        for (int i = 0; i < nums2.length; i++) {
            int left = 0;
            int right = nums1.length;
            int target = nums2[i];
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums1[mid] == target) {
                    arr[top] = target;
                    top++;
                    break;
                } else if (nums1[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

        }
        int[] arr1 = new int[top];
        for (int i = 0; i < top; i++) {
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (i == 0 || arr1[i - 1] != arr1[i]) {
                arr1[index] = arr1[i];
                index++;
            }
        }
        int[] arr2 = new int[index];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr1[i];

        }
        return arr2;

    }
}