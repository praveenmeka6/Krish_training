package com.praveen;

import java.util.Stack;

public class CareTaker {
    Stack<FbPosts.PostMemento> history = new Stack<>();

    public void save(FbPosts fbPosts) {
        history.push(fbPosts.save());
    }

    public void revert(FbPosts fbPosts) {
        if(!history.isEmpty()){
            fbPosts.revert(history.pop());
        }
        else {
            System.out.println("cannot revert");
        }
    }
}
