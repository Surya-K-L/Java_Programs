// You have an empty sequence, and you will be given N queries. Each query is one of these three types:

// 1 x  => Push the element x into the stack.

// 2     => Delete the element present at the top of the stack.

// 3     => Print the maximum element in the stack.

// Input Format

// The first line of input contains an integer, N. The next N lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

// Output Format

// For each type 3 query, print the maximum element in the stack on a new line.

// Sample Input

// 10
// 1 97
// 2
// 1 20
// 2
// 1 26
// 1 20
// 2
// 3
// 1 91
// 3
// Sample Output

// 26
// 91

// For example:

// Input	Result
// 6       9
// 1 8     20
// 1 9
// 3
// 2
// 1 20
// 3


// 10      5
// 1 5     Stack is Empty
// 1 7
// 2
// 3
// 2
// 1 12
// 1 9
// 2
// 2
// 3





import java.util.*;
public class Empty_Sequence_N_Queries{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        Stack<Integer>s=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a==1){
                int b=sc.nextInt();
                s.push(b);
            }
            else if(a==2)
             s.pop();
            else{
                if(s.empty())
                    System.out.print("Stack is Empty");
                else{
                    int d=Collections.max(s);
                    System.out.println(d);
                }
            }
        }
        sc.close();
    }
}
