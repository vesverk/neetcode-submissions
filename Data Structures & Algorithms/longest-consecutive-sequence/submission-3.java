class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int count = 1;
        int max = 1;
        Arrays.sort(nums);
        for ( int i = 0; i < nums.length -1; i++){
            if( nums[i+1] == nums[i]){
                continue;
            }
            if ( nums[i+1] == nums[i]+1){
                count += 1;
            }
            else {
                max = Math.max(count,max);
                count = 1;
            }
        }
        return Math.max(count,max);
    }
}
