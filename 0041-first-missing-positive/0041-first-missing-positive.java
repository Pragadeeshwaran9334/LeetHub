class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> li=new HashSet<>();
        for(int i:nums){
            if(i>0){
                li.add(i);
            }
        }int j=1;
        while(li.contains(j))
        {
            j++;
        }
        return j;
    }
}