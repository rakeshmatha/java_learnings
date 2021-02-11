import java.util.Stack;

public class WellFormedString {
    public static void main(String[] args) {
        String balString = "{[()]}";
        Stack<Character> value = new Stack<>();
        for (int i = 0; i < balString.length(); i++) {
            char ch = balString.charAt(i);
            if (value.empty()){
                value.push(ch);
            }
            else if(ch == '{'|| ch =='['|| ch=='(' ){
                value.push(ch);
            }
            else if(ch == '}'&& value.peek() == '{' ){
                value.pop();
            }
            else if(ch == ']'&& value.peek() == '['){
                value.pop();
            }
            else if(ch == ')'&& value.peek() == '('){
                value.pop();
            }
        }
        if(value.empty()){
            System.out.println("Balanced string");
        }
        else {
            System.out.printf("Un-Balanced String");
        }
    }
}