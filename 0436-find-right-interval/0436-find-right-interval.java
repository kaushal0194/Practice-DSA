class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] arr = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int target = intervals[i][1];
            int min = Integer.MAX_VALUE;
            int index=-1;
            for (int j = 0; j < intervals.length; j++) {

                if (intervals[j][0] >= target) {
                    if (intervals[j][0] < min) {
                        min = intervals[j][0];
                        index = j;
                    }
                }
            }

                arr[i] = index;
            
        }
        return arr;
    }
}