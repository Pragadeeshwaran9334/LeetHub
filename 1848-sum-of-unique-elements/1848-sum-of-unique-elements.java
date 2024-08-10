class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<n-1;i++){
            int j=i;
            if(nums[i]==nums[i+1]){
                while(j<n && nums[i]==nums[j]){
                    j++;
                }
                i=j-1;
            }
            else{
                sum+=nums[i];
            }
        }
        if(nums[n-2]!=nums[n-1]){
            sum+=nums[n-1];
        }
        return sum;
    }
}