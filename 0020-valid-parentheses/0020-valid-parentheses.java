class Solution {
    public boolean isValid(String s) {
        boolean res=true;
        Stack<Character>stack=new Stack<>();
 for(char x:s.toCharArray()){
    if(x=='(' || x=='{' || x=='['){
      stack.push(x);
    }
    else{
       
     if(stack.isEmpty()){
        return false;
     }
      char top=stack.pop();
     if(top=='(' && x!=')'){
         /// stack.pop();
          return false;
     }
     if(top=='[' && x!=']'){
         // stack.pop();
          return false;
     }
      if(top=='{' && x!='}'){
         // stack.pop();
          return false;
     }

    }
 

 }
 


return stack.isEmpty();

    }
}