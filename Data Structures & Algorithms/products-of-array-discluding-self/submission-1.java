// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int [] copy_nums = new int[nums.length];
//         for(int i = 0; i < nums.length; i++){
//             long product = 1;
//             System.arraycopy(nums, 0, copy_nums, 0, nums.length);
//             ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums.length));
//             list.remove(i);
//             for(int num : copy_nums){
//                 product *= num;
//             }
//             int[] num = {(int)product};

//         }       
//         return int[] num;
//     }
// }

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] ans = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             int product = 1;
//             for (int j = 0; j < nums.length; j++) {
//                 if (i != j) {
//                     product *= nums[j];
//                 }
//             }
//             ans[i] = product;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int[] copy = new int[nums.length - 1];

            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    copy[k++] = nums[j];
                }
            }

            int product = 1;
            for (int num : copy) {
                product *= num;
            }

            ans[i] = product;
        }

        return ans;
    }
}