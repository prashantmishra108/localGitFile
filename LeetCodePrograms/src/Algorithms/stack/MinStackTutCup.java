package Algorithms.stack;

import java.util.Stack;

//https://www.tutorialcup.com/leetcode-solutions/min-stack-leetcode-solution.htm
class MinStack1 {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> mn=new Stack<>();
   
    public void push(int x) 
    {
        if(st.empty() || x<=mn.peek())
            mn.push(x);
        st.push(x);
    }
    
    public void pop() 
    {
        if(st.peek().equals(mn.peek())) 
            mn.pop();
        st.pop();
    }
    
    public int top() 
    {
         return st.peek();
    }
    
    public int getMin() 
    {
        return mn.peek();
    }
}
class MinStackTutCup{
  public static void main(String args[])
    {
        MinStack1 minStack = new MinStack1();
        minStack.push(-4);
        minStack.push(0);
        minStack.push(-3);
        int param1 = minStack.getMin(); 
        minStack.pop();
        int param2 = minStack.top();   
        int param3 = minStack.getMin(); 
        
    System.out.println(param1);
        System.out.println(param2);
        System.out.println(param3);
    }
}