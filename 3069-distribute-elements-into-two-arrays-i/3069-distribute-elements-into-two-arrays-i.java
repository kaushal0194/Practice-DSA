class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int min=Integer.MAX_VALUE;
        int t1=1;
        int t2=1;
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        for(int i=2;i<n;i++){
            if(arr1[t1-1]>arr2[t2-1]){
                arr1[t1]=nums[i];
                t1++;
            }
            else{
                arr2[t2]=nums[i];
                t2++;
            }
            
        }
        int top=0;
        for(int i=t1;i<t1+t2;i++){
            arr1[i]=arr2[top];
            top++;

        }
        return arr1;
    }
}