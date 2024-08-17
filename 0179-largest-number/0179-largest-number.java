class Solution {
    public String largestNumber(int[] nums) {
        int N = nums.length;
        String str[] = new String[N];
        for(int i=0;i<N;i++){
            str[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(str,(p,w) -> (w+p).compareTo(p+w));
        StringBuilder panda = new StringBuilder();
        for(int i=0;i<N;i++){
            panda.append(str[i]);
        }
        if(panda.charAt(0) == '0')
            return "0";
        else
            return panda.toString();
    }
}