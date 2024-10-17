// Compress the given strings as given below
// INPUT
// aaabbb
// OUTPUT
// a3b3

// INPUT
// ab
// OUTPUT
// a1b1


import java.util.*;
public class A3B3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char arr[]=a.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            c=1;
            while(i<arr.length-1 && arr[i]==arr[i+1])
            {
                c++;
                i++;
            }
            System.out.print(arr[i]+""+c);
        }
    }
}
