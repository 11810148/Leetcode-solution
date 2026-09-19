class Solution {
    public int[] twoSum(int[] nums, int target) {
          HashMap<Integer,Integer>map=new HashMap<>();
          int res[]={-1,-1};
          for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
          }
          int tmp;
     for(int i=0;i<nums.length;i++){
        tmp=target-nums[i];
        if(map.containsKey(tmp) && map.get(tmp)!=i ){
            res[0]=i;
            res[1]=map.get(tmp);
        }
     }

   return res;

    }
}