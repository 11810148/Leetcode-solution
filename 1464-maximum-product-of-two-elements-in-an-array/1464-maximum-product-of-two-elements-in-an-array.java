class Solution {
    public int maxProduct(int[] nums) {
        int res=1;
        Queue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int x:nums){
            pq.add(x);
        }
      // Arrays.sort(nums);
      return (pq.poll()-1)*(pq.poll()-1);


      // return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}