class Solution {
    public void rotate(int[] nums, int k) {
        int k1=k%nums.length;
        int[] arr=new int[nums.length];
        int top=0;
        for(int i=0;i<k1;i++){
            arr[top]=nums[nums.length-k1+i];
            top++;
        }
        for(int i=0;i<nums.length-k1;i++){
            arr[top]=nums[i];
            top++;
        }
        for(int i=0;i<top;i++){
            nums[i]=arr[i];
        }


        
    }
}