// Write a program to find if a string is the rotated version of another string. Given two strings A and B, Check whether A can be shifted some number of times to get B or not. For example, if A is 'abcde' and B is 'cdeab', print true.

// Input Format

// First line of input is T, no of test cases First line of each case is string A. Second line of each case is another string B.

// Constraints

// 1 <= |S| <= 100

// Output Format

// Single line - "true" if it is possible to get string B upon rotating string A by 'n' times otherwise "false".

// Sample Input 0

// 1
// abcde
// cdeab

// Sample Output 0

// true



import java.util.*;
public class Rotated_Version_Of_Other_String{
    public static void main(String hdsa[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            String a=sc.next(),b=sc.next();
            int t=0;
            ArrayList<Character>al=new ArrayList<>();
            ArrayList<Character>al2=new ArrayList<>();
            if(a.length()==b.length())
                for(int i=0;i<a.length();i++)
                {
                    al.add(a.charAt(i));
                    al2.add(b.charAt(i));
                }
                for(int i=0;i<a.length();i++)
                {
                    Collections.rotate(al,1);
                    if(al.equals(al2))
                    {
                        t=1;
                        System.out.print("true");
                        break;
                    }
                }
                if(t==0)
                {
                    System.out.print("false");
                }
                System.out.println();
        }
        sc.close();
    }
}