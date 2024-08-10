// Write a program to store characters in an array and print only the vowels only

// For example:

// Input	Result
// 5       AE
// A
// B
// C
// D
// E

// 10      IAI
// S
// R
// I
// S
// H
// A
// K
// T
// H
// I



import java.util.*;
public class Store_And_Display_Only_Vowels{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
            if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
                System.out.print(arr[i]);
        }
        sc.close();
    }
}