// A library charges a fine for every book returned late.For the first 5 days,the fine is 50 paise,for

// 6-10 days fine is one rupee and for above 10 days the fine is 5 rupees.If you return the book

// after 30 days,message should be"Membership Cancelled".Write a program to accept the number of days

// the member is late to return the book and display the fine or the appropriate member cancellation

// message.

// For example:

// Input Result 
// 7     Fine is 1 rupee 
// 4     Fine is 50 paise 
// 40    Membership Cancelled 
// 12    Fine is 5 rupees

import java.util.*;

public class Library_fine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        if (days >= 1 && days <= 5) {
            System.out.print("Fine is 50 paise");
        } else if (days >= 6 && days <= 10) {
            System.out.print("Fine is 1 rupee");
        } else if (days > 5 && days < 30) {
            System.out.print("Fine is 5 rupees");
        } else {
            System.out.print("Membership Cancelled");
        }
        sc.close();
    }
}
