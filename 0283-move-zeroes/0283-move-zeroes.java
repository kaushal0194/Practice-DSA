class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int k=0;
        
        
        for(int i=1;i<nums.length;i++){

            if(nums[i-1]==0 && k<count){
                k++;
                for(int j=i;j<nums.length;j++){
                nums[j-1]=nums[j];
                
                

                }
                 nums[nums.length-1]=0;
                i--;



            }
        }

        
    }
}