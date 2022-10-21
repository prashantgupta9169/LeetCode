class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            // System.out.println(map.toString()+" "+i+" "+x);
            if(map.getOrDefault(x,-1)>=0 && i-map.getOrDefault(x,0)<=k){
                // System.out.println(i+" "+map.getOrDefault(x,0));
                return true;
            }
            map.put(x,i);
        }
        return false;
    }
}