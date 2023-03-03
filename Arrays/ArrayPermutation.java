
// https://leetcode.com/problems/build-array-from-permutation/submissions/908337395/

package Arrays;


// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]
// Explanation: The array ans is built as follows: 
// ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//     = [0,1,2,4,5,3]

class ArrayPermutation {

    public int[] buildArray(int[] nums) {

        int l = nums.length;
        for (int i = 0; i < l; i++) {
            nums[i] = nums[i] + l * (nums[nums[i]] % l);
        }
        for (int i = 0; i < l; i++) {
            nums[i] = nums[i] / l;
        }
        return nums;

    }
}