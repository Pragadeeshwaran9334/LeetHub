class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String operation: operations){
            char c=operation.charAt(1);
            if(c == '+'){
                ans++;
            }else if(c == '-'){
                ans--;
            }
        }
        return ans;
    }
}