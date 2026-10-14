class MyStack {
Queue<Integer>stack=null;
    public MyStack() {
        this.stack=new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack.add(x);
       int k=stack.size()-1;
        while(k>0){
            stack.add(stack.poll());
            k-=1;
        }
        
    }
    
    public int pop() {
      return  stack.poll();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */