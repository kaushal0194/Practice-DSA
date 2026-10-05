class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permute(nums,0,res);
        return res;
        
    }
    void permute(int[] nums,int i,List<List<Integer>> res){
        if(i==nums.length){
            List<Integer> arr=new ArrayList<>();
            for(int num:nums){
                arr.add(num);
            }
            res.add(arr);
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            permute(nums,i+1,res);
            swap(nums,i,j);
        }

    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}