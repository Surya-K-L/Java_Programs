// Write a program to read a set of strings during runtime using a Hashset S1, LinkedHashSet S2 and TreeSet S3 which will be able to store only Strings. Create a printAll() method and pass S1, S2, S3 which will print all the elements and observe the inference.

// Note: Size of the set is 6.



// For example:

// Input	                                                Result
// Infosys HCL Wipro TechMahindra Hexaware Altran          Using HashSet: [HCL, Wipro, Infosys, TechMahindra, Altran, Hexaware]
//                                                         Using LinkedHashSet: [Infosys, HCL, Wipro, TechMahindra, Hexaware, Altran]
//                                                         Using TreeSet: [Altran, HCL, Hexaware, Infosys, TechMahindra, Wipro]

// Krish Ram Venkat Govind Madhav Mukund                   Using HashSet: [Mukund, Krish, Madhav, Govind, Venkat, Ram]
//                                                         Using LinkedHashSet: [Krish, Ram, Venkat, Govind, Madhav, Mukund]
//                                                         Using TreeSet: [Govind, Krish, Madhav, Mukund, Ram, Venkat]


import java.util.*; 
class StringLinkedHashSet{
    HashSet<String> Hs=new HashSet<>();
    LinkedHashSet<String> Ls=new LinkedHashSet<>();
    TreeSet<String> Ts=new TreeSet<>();
    public void add(String company){
        Hs.add(company);
        Ls.add(company);
        Ts.add(company);
    }
    public void print(){
        System.out.println("Using HashSet: "+Hs+"\nUsing LinkedHashSet: "+Ls+"\nUsing TreeSet: "+Ts);
    }
}
        public class LinkedHashSetString{
        public static void main(String h[]){
        Scanner sc=new Scanner(System.in);
        StringLinkedHashSet set=new StringLinkedHashSet();
        for(int i=0;i<6;i++)
        {
            String s=sc.next();
            set.add(s);
        }
        set.print();
        sc.close();
    }
}
