class MyStack {
     Queue<Integer>q1=new LinkedList<Integer>();
  Queue<Integer>q2=new LinkedList<Integer>();
    int top;

    /** Initialize your data structure here. */
    public MyStack() {
       // Queue<Integer>q=new Queue<Integer>();
       //     private Queue<Integer> queue = new LinkedList<>();
//
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        top=x;
        for(int i=0;i<q1.size();i++){
        q2.add(q1.remove());
        
        }
         Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
      
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q2.isEmpty())
            return -1;
       else
           return q1.poll();
      
         
       
      
    }
    
    /** Get the top element. */
    public int top() {
        return q1.peek();
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
        
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