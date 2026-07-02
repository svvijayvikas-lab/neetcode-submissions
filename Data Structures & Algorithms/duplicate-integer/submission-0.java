class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length - 1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
}