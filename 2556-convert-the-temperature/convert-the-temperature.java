class Solution {
    public double[] convertTemperature(double celsius) {
        double[]ans=new double[2];
        ans[1]=1.80*celsius+32.00;
        ans[0]=celsius+273.15;
        return ans;
    }
}