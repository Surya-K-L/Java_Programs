// I give you a grid of size NxN that has the following specifications:

// 1. Each unit in the grid contains either police or a thief

// 2 Police can only catch a criminal if both of them are in the same row

// 3. Each police can only catch one criminal. 

// 4. Police cannot catch a criminal more than k units away from the police

// 5. Any cell with N means he is a normal person and not a police or thief

// You need to find the maximum number of criminals that can be caught in the grid.

// Input format

// First line: Two space-separated integers N and K

// Next N lines: N space-separated characters (denoting each cell in the grid)

// Output format

// Print the maximum number of thieves that can be caught in the grid.

// Code constraints

// 1 N = 1000

// 1<= K<= N*N



// Sample Input

// 1
// 3 1
// P T P
// T P T
// T T P

// Output:
// 3

// Total Thieves = 5

// Given that k = 1, a thief who is in the adjacent cell can only be caught

// Number of thieves reachable by policemen in Row 1 = 1
// Number of thieves reachable by policemen in Row 2 = 2
// Number of thieves reachable by policemen in Row 3 = 1
// However, one policeman can catch at most 1 thief. Hence, in Row 2, only 1 thief is catchable.
// Therefore, the 3 thieves can be caught.

// For example:

// Input	    Result
// 3 1         3
// N T P
// N P T
// N T P

// 4 2         4
// N T N P
// T N N P
// N N P T
// T T P P


import java.util.Scanner;

public class Police_Thief {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]=='P'){
                    int st=j-k;
                    int ed=j+k;
                    while(st<j || ed>j){
                        if(st>=0){
                            if(arr[i][st]=='T'){
                                count++;
                                arr[i][st]=0;
                                break;
                            }
                        }
                        if(ed<n){
                            if(arr[i][ed]=='T'){
                                count++;
                                arr[i][ed]=0;
                                break;
                            }
                        }
                        st++;
                        ed--;
                        }
                    }
                }
            }
        
            System.out.println(count);
            sc.close();
        }
}

