class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            int num=nums[i];
            int left=0;
            int right=i-1;
            while(left<right){
                int sum=nums[left]+nums[right];
                if(sum>num){
                    count+=right-left;
                    right--;
                }
                else{
                    left++;
                }
                
            }
        }
        return count;
    }
}