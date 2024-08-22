// Given a string containing only three types of characters: ‘[‘,’]’,’{‘,’}’ '(', ')', write a function to check whether this string is valid. We dene the validity of a string by these rules: Any left parenthesis '[' must have a corresponding right parenthesis ']'. Any left parenthesis '{' must have a corresponding right parenthesis '}'. Any left parenthesis '(' must have a corresponding right parenthesis ')'. An empty string is also valid. ‘]’ before ‘[‘ is not considered a valid balance ‘}’ before ‘{‘ is not considered a valid balance ‘)’ before ‘(‘ is not considered a valid balance 

// Input Format

// The first line of input is number of test cases. The string size will be in the range [1, 100].

// Constraints

// 1

// Output Format

// True/False

// Sample Input 0

// 1
// ({[]})
// Sample Output 0

// True

// For example:

// Input	Result
// 1       True
// ({[]})

// 1
// ({[})]  False


import java.util.*;
public class Valid_Parenthesis{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            String a=sc.nextLine();
            if(isValid(a))
            {
                System.out.print("True");
            }
            else
            {
                System.out.print("False");
            }
        }
        sc.close();
    }
    public static boolean isValid(String s) {
        Stack<Character>al=new Stack<>();
        if(s.length()==1||s.length()==0)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(al.isEmpty() && (s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'))
            {
                return false;
            }
            if(s.charAt(i)=='(')
            {
                al.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(al.peek()=='(')
                {
                    al.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)=='{')
            {
                al.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}')
            {
                if(al.peek()=='{')
                {
                    al.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)=='[')
            {
                al.push(s.charAt(i));
            }
            else if(s.charAt(i)==']')
            {
                if(al.peek()=='[')
                {
                    al.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(al.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}