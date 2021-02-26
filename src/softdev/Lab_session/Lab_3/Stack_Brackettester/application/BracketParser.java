package softdev.Lab_session.Lab_3.Stack_Brackettester.application;

import softdev.Lab_session.Lab_3.Stack_Brackettester.util.Stack;
import java.util.ArrayList;

public class BracketParser implements BracketParserIntf {

    @Override
    public boolean checkBrackets(String text1) {
        Stack<Character> text = new Stack<Character>();
        char[] arr1 = text1.toCharArray();
        ArrayList<Character> arr = new ArrayList<Character>();
        for (char c : arr1) {
            if (cheakText(c))
                arr.add(c);
        }
        for (char c : arr) {
            if (c == '(') {
                text.push(')');
            } else if (c == '{') {
                text.push('}');
            } else if (c == '[') {
                text.push(']');
            } else if (c == '<') {
                text.push('>');
            } else if (text.isEmpty() || text.pop() != c) {
                return false;
            }
        }
        return text.isEmpty();
    }

    public boolean cheakText(char c) {
        if (c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '<' || c == '>') {

            return true;
        } else {
            return false;
        }
    }
}
