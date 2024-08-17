// Extract the Number from given string

// Benny once had trouble finding the numbers in a string.There are various numbers in the string and you need to extract the number from the string.One catch is,you need to find only those numbers which do not contain 9. For example,if the string contains"hello this is alpha 5051 and 9475".You will extract 5051 and not 9475. Help Benny find the numbers

// Input Format

// The first line consists of T test cases and next T lines contain a string.

// Length of each string S may be between 1 to 1000. SAMPLE INPUT:1 Hi5 Welcome567 batch 2019

// Output Format

// For each string output the number stored in that string.If a string has no numbers print-1.

// Constraints:

// 1<=T<=100

// 1<=|S|<=1000 SAMPLE OUTPUT:5 567

import java.util.*;

public class Extract_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine().replaceAll("[^0-9]", " ").replaceAll("\\s+", " ").trim();
            String h[] = s.split(" ");
            int flag = 0;
            String a = "[0-9]+";
            for (int j = 0; j < h.length; j++) {
                if (h[j].matches(a)) {
                    if (!h[j].contains("9")) {
                        System.out.print(h[j] + " ");
                    }
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.print("-1");
            }
            System.out.println();
        }
        sc.close();
    }
}