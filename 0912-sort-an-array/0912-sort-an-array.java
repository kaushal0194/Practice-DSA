class Solution {
    void merge(int[] arr, int low,int mid,int high){
        int [] temp=new int[high-low+1];
        int first=low;
        int right=mid+1;
        int index=0;
        while(first<=mid && right<=high){
            if(arr[first]<=arr[right]){
                temp[index]=arr[first];
                index++;
                first++;
            }
            else{
                temp[index]=arr[right];
                index++;
                right++;
            }

        }
        while(first<=mid){
            temp[index]=arr[first];
            index++;
            first++;

        }
                while(right<=high){
            temp[index]=arr[right];
            index++;
            right++;

        }
        index=0;
        while(low<=high){
            arr[low]=temp[index];
            low++;
            index++;

        }
    }
    void mergeSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;

    }
}