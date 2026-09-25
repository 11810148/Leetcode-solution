class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        int count=0;
         Map<Integer,Integer>map=new HashMap<Integer,Integer>();
          String[] res=new String[score.length];
       for(int i=0;i<score.length;i++){
        pq.add(score[i]);
        map.put(score[i],i);

       }
       while(!pq.isEmpty()){
        
            if( count==0){
                res[map.get(pq.poll()) ]="Gold Medal";
                count+=1;

            }
            else if( count==1){
                res[map.get(pq.poll()) ]="Silver Medal";
                 count+=1;

            }
            else if( count==2){
                res[map.get(pq.poll()) ]="Bronze Medal";
                 count+=1;
            }
            else{
                res[map.get(pq.poll()) ]=Integer.toString(count+1);
                count+=1;
            }
       }
       

        return res; 
    }
}