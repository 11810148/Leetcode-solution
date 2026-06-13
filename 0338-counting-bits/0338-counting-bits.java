class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        int count=0;
        int j;
    for(int i=0;i<=n;i++){
        count=0;
        j=i;
      while(j!=0){
        j=(j & (j-1));
        count+=1;
      }
       res[i]=count;

    }
      return res;
    }
}