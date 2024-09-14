// Create an ArrayList which will be able to store only Strings. Create a printAll method which will print all the elements using an Iterator.

// Note: Size of ArrayList is 6.

// Sample Input:

// Java Oracle C MySql Perl Pascal

// Sample Output:

// Java Oracle C MySql Perl Pascal

import java.util.*;

public class Print_Using_Iterator {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            al.add(sc.next());
        }
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String b = itr.next();
            System.out.print(b + " ");
        }
        sc.close();
    }

}
