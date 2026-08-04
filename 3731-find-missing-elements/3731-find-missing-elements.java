class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int small=nums[0];
        int great=nums[nums.length-1];
        for(int i=small;i<=great;i++){
            list.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                list.remove((Integer)nums[i]);
            }
        }


        return list;
    }
}