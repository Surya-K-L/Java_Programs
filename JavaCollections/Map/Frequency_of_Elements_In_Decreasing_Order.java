// Given an integer array, sort the array according to the frequency of elements in decreasing order, if frequency of two elements are same then sort in increasing order using Map.

// Sample Input:

// 8

// 2 1 2 4 7 7 4 7 

// Sample Output:

// 7 7 7 2 2 4 4 1

// For example:

// Input	                    Result
// 11                          3 3 3 3 2 2 2 12 12 4 5
// 2 3 2 4 5 12 2 3 3 3 12





import java.util.*;
public class Frequency_of_Elements_In_Decreasing_Order{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Map<Integer, Integer> fMap = new HashMap<>();
        for (int num : arr) {
            fMap.put(num, fMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> eList = new ArrayList<>(fMap.entrySet());
        Collections.sort(eList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o, Map.Entry<Integer, Integer> p) {
                if (o.getValue() != p.getValue()) {
                    return p.getValue() - o.getValue();
                }
                else {
                    return o.getKey() - o.getKey();
                }
            }
        });
        List<Integer> sArr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : eList) {
            int num = e.getKey();
            int f = e.getValue();
            for (int i = 0; i < f; i++) {
                sArr.add(num);
            }
        }
        Iterator<Integer> it = sArr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        sc.close();
    }
}
