// A string containing only parentheses is balanced if the following is true:

// 1. if it is an empty string

// 2. if A and B are correct, AB is correct,

// 3. if A is correct, (A) and {A} and [A] are also correct.

// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

// Given a string, determine if it is balanced or not.

// Input Format

// First line of input denotes the number of test cases.

// And There will be n lines, each having a single non-empty string.

// Output Format

// For each case, print 'true' if the string is balanced, 'false' otherwise.


// For example:

// Input	    Result
// 4           true
// {}()        true
// ({()})      false
// {}(         true
// []



import java.util.*;
public class Balance_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            Stack<Character> st = new Stack<>();
            boolean b = true;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(' || c == '{' || c == '[')
                    st.push(c);
                else if (c == ')' || c == '}' || c == ']'){
                    if (st.isEmpty()){
                        b = false;
                        break;
                    } 
                    else if (isMatchingPair(st.peek(), c))
                        st.pop();
                    else{
                        b = false;
                        break;
                    }
                }
            }
            if (!st.isEmpty()) {
                b = false;
            }
            System.out.println(b ? "true" : "false");
        }
        sc.close();
    }
    public static boolean isMatchingPair(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']');
    }
}
