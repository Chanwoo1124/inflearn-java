package collection.Map.test.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> stack = new ArrayDeque<>();

    public void visitPage(String a){
        stack.push(a);
    }
    public String goBock(){
        return stack.pop();
    }
}
