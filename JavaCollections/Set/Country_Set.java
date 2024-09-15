// Develop a java class with a instance variable Country HashSet (H1) and add a method saveCountryNames(String CountryName), the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).

// Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.

// Input:

// The first line of input denotes the number of country Names to store in the Arraylist

// The second line of input denotes the country names and the third line of input is the country Name you want to search


// For example:

// Input	                                    Result
// 5                                           Switzerland is present in the List
// India Canada Japan Germany Switzerland
// Switzerland

// 3                                           null
// Sweden France Denmark
// India



import java.util.*;
public class Country_Set{
Set<String> h1=new HashSet<String>();
public static void main(String str[]){
    Scanner sc=new Scanner(System.in);
    Country_Set m=new Country_Set();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        String ma=sc.next();
        m.saveCountryNames(ma);
    }
    String an=sc.next();
    m.getCountry(an);
    sc.close();
    
}
public Set<String> saveCountryNames(String s){
    h1.add(s);
    return h1;
}
public void getCountry(String st){
    if(h1.contains(st)){
        System.out.println(st+" is present in the List");
    }
    else{
        System.out.println("null");
    }
}
}
