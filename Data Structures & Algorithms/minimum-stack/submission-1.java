class MinStack {
    Stack <Integer> stack;
    Stack <Integer> minStack;
    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        int minVal = minStack.isEmpty() ? val : Math.min(val,minStack.peek());
            minStack.push(minVal);
        }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
            stack.pop();
            minStack.pop();
            }
    
    public int top() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }else{
            return stack.peek();
        }
    }
    
    public int getMin() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }else{
            return minStack.peek();
        }
    }
}
