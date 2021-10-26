package lab4.task1;
import java.util.Stack;

public class Text {
    String text;

    boolean Check(){
        Stack<String> parentheses= new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='(') parentheses.push("(");
                if (text.charAt(i)==')')
                    if (!parentheses.empty()) parentheses.pop();
                        else return false;
        }
        return parentheses.empty();
    }
}
