class Solution
{
    public void solve(int[] nums, List<Integer> list, Set<List<Integer>> result,int i)
    {
        if(i==nums.length)
        {
           result.add(new ArrayList<>(list)); 
           return;
        }
        else
        {
           list.add(nums[i]); 
           solve(nums,list,result,i+1); 
           list.remove(list.size()-1); 
           solve(nums,list,result,i+1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums)
    {
        Arrays.sort(nums);
         Set<List<Integer>> result= new HashSet<>(); 
        List<Integer> list = new ArrayList<>();
        solve(nums,list,result,0); 
        return new ArrayList<>(result); 
    }
}