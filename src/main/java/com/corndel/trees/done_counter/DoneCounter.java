package com.corndel.trees.done_counter;

import com.corndel.trees.dto.Task;

import java.util.List;
import java.util.Stack;

public class DoneCounter {

    public static int countIterative(Task root){
        if (root == null) return 0;

        int count = 0;
        Stack<Task> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Task current = stack.pop();
            if (current.isDone()) {
                count++;
            }

            List<Task> children = current.getChildren();
            if (children != null) {
                for (Task child : children) {
                    stack.push(child);
                }
            }
        }

        return count;
    }

    public static int countRecursive(Task task) {
        return 0;
    }

}
