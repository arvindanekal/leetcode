class MyStack {
    Queue queue = new LinkedList();
    
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Queue newqueue = new LinkedList();
        Object item = null;
        while(queue.peek() != null){
            item = queue.remove();
            if(queue.peek() != null)
                newqueue.add(item);
        }
        while(newqueue.peek() != null){
            queue.add(newqueue.remove());
        }
    }

    // Get the top element.
    public int top() {
        Queue newqueue = new LinkedList();
        Object item = null;
        while(queue.peek() != null){
            item = queue.remove();
            newqueue.add(item);
        }
        while(newqueue.peek() != null){
            queue.add(newqueue.remove());
        }
        if(item == null) return 0;
        return (int)item;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.peek() == null;
    }
}
