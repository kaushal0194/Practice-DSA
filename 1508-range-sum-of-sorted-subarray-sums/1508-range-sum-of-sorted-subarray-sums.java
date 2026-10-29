class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr = new int[n * (n + 1) / 2];

        int top = 0;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];
                arr[top] = sum;
                top++;
            }
        }
        Arrays.sort(arr);
        long sum1 = 0;
    int mod = 1_000_000_007;

    while (left <= right) {
        sum1 = (sum1 + arr[left - 1]) % mod;
        left++;
    }
        return (int)sum1;
    }
}