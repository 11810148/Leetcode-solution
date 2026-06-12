class Solution {
    public int hammingWeight(int n) {
        String res=Integer.toBinaryString(n);
        int count=0;
       for(int i=0;i<res.length();i++){
        if(res.charAt(i)=='1'){
            count+=1;
        }
       }

       return count;


    }
}