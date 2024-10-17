// Read n lines and print the lines

// For example:

// Input	                      Result
// 2
// This is the first line      This is the first line
// This is the second line     This is the second line


// 1
// This is the first line      This is the first line



import java.util.*;
public class Read_N_Lines_Print_N_lines{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            System.out.println(sc.nextLine());
        }
    }
}
