// Write a program to reverse the words in a sentence except the numeric.It should capitalize the first letter post reversal.

// For example:

// Input	                                Result
// there are 26 alphabets in english       Ereht Era 26 Stebahpla Ni Hsilgne 

// I26t is not a digit 1234                T26i Si Ton A Tigid 1234 

import java.util.*;

public class Reverse_Words_In_Sentence_Except_Numeric {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b[] = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            String c = b[i];
            ArrayList<Character> al = new ArrayList<>();
            for (int j = 0; j < c.length(); j++) {
                if (!Character.isDigit(c.charAt(j))) {
                    al.add(c.charAt(j));
                }
            }
            char t[] = new char[al.size()];
            for (int s = 0; s < t.length; s++) {
                t[s] = al.get(s);
            }
            int y = t.length - 1;
            for (int p = 0; p < c.length(); p++) {
                if (Character.isDigit(c.charAt(p))) {
                    System.out.print((c.charAt(p)));
                } else if (p == 0) {
                    System.out.print(Character.toUpperCase(t[y]));
                    y--;
                } else {
                    System.out.print(t[y]);
                    y--;
                }
            }
            System.out.print(" ");
        }
        sc.close();
    }
}