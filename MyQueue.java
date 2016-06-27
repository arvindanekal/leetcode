class MyQueue {
    Stack stack = new Stack();
    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack temp = new Stack();
        if(stack.isEmpty()) return;
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        temp.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    // Get the front element.
    public int peek() {
        Stack temp = new Stack();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        int result = (int)temp.pop();
        temp.push(result);
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return result;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
