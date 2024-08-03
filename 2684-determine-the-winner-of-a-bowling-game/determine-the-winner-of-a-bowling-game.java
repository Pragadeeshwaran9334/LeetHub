class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<player1.length;i++){
            if(i==0){
                sum+=player1[i];
            }
            else if(i==1){
                if(player1[i-1]==10){
                    sum+=player1[i]*2;
                }
                else{
                    sum+=player1[i];
                }
            }
            else{
                if(player1[i-1]==10||player1[i-2]==10)
                {
                    sum+=player1[i]*2;
                }
                else{
                    sum+=player1[i];
                }
            }
        }
        for(int i=0;i<player2.length;i++){
            if(i==0){
                sum1+=player2[i];
            }
            else if(i==1){
                if(player2[i-1]==10){
                    sum1+=player2[i]*2;
                }
                else{
                    sum1+=player2[i];
                }
            }
            else{
                if(player2[i-1]==10||player2[i-2]==10)
                {
                    sum1+=player2[i]*2;
                }
                else{
                    sum1+=player2[i];
                }
            }
        }
        if(sum<sum1){
            return 2;
        }
        else if(sum>sum1){
            return 1;
        }
        else{
            return 0;
        }
    }
}