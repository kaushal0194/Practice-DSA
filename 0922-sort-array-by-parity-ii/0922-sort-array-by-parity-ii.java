class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] nums1=new int[nums.length];
        int odd=1;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums1[even]=nums[i];
                even+=2;
            }
            else{
                nums1[odd]=nums[i];
                odd+=2;
            }
        }

        return nums1;
    }
}