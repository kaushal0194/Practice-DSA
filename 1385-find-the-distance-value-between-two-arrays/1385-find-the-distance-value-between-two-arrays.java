class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int num=0;
        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            int count=0;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(temp-arr2[j])>d){
                    count++;
                }
            }
            System.out.println(count);
            if(count==arr2.length){
                num++;
            }
        }
        return num;
    }
}