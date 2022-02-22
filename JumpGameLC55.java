package com.company;
class Solution4 {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastIndex) {
                lastIndex = i;
            }
        }
        return lastIndex == 0;
    }
}
    public class JumpGameLC55 {
        public static void main(String[] args) {
           int[] nums = {3,2,1,0,4};
           Solution4 a = new Solution4();
            System.out.println(a.canJump(nums));

        }
    }
