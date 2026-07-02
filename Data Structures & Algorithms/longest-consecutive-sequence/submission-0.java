class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int l=0;
        for(int num : set)
        {
            if(!set.contains(num-1))
            {
                int current = num;
                int length=1;
                while(set.contains(current+1)){
                    current++;
                     length++;
                }
                l=Math.max(l,length);
                
            }
        }
        return l;
    }
}
