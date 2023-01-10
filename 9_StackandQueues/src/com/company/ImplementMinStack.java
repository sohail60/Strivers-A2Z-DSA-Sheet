package com.company;

import java.util.Stack;

public class ImplementMinStack {
    Stack<Integer> stack;
    Stack<Integer> supportingStack;

    public ImplementMinStack(){
        this.stack=new Stack<>();
        this.supportingStack=new Stack<>();
    }

    void push(int value){
        stack.push(value);
        if (supportingStack.size()==0 || supportingStack.peek()>=value){
            supportingStack.push(value);
        }
    }

    int pop(){
        if(stack.size()==0){
            return -1;
        }

        if(stack.peek()==supportingStack.peek()){
            supportingStack.pop();
        }
        return stack.pop();
    }

    int getMin(){
        if(supportingStack.size()==0){
            return -1;
        } else {
            return supportingStack.peek();
        }
    }
}
