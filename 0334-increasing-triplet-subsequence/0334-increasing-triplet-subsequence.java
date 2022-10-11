class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for(int x:nums){
            if(x<=small){
                small=x;
            }
            else if(x<=big){
                big=x;
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}