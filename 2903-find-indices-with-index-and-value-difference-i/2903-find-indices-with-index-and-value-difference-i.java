class Solution {
    public int[] findIndices(int[] nums, int idiff, int vdiff) {
        int[] arr=new int[2];
        int left=0;
        int n=nums.length;
        arr[0]=-1;
        arr[1]=-1;
        while(left<=n-idiff){
            int right=left+idiff;
            while(right<n){
                if(Math.abs(nums[left]-nums[right])>=vdiff){
                    arr[0]=left;
                    arr[1]=right;
                }
                right++;
            }
            left++;
        }
        return arr;
    }
}