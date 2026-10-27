class Solution {
    public int hIndex(int[] citations) {
        int left=0;
        int right=citations.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(citations[mid]>=citations.length-mid){
                right=mid;
            }
            else{
                left=mid+1;
            }

        
        }
        return citations.length-left;
    }
}