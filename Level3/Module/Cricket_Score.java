// Find the score after one over in a cricket match with the given cricket score card

// . means no run

// Y means it is a WIDE (only bowler score gets added)

// Any even number the same batsman faces the next ball

// Any odd number the next batsman faces the next ball

// 6 balls per over

// Any other format print "Invalid"

// .



// For example:

// Input	Result
// 2461..
//         BATSMAN 1: 13
//         BATSMAN 2: 0
//         BOWLER: 13

// ......
//         BATSMAN 1: 0
//         BATSMAN 2: 0
//         BOWLER: 0

// .....Y
//         BATSMAN 1: 0
//         BATSMAN 2: 0
//         BOWLER: 1

// 111111
//         BATSMAN 1: 3
//         BATSMAN 2: 3
//         BOWLER: 6



import java.util.*;
public class Cricket_Score{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int bo=0,bt1=0,bt2=0,bc=0,bt=1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='.')
            {
                bc++;
            }
            else if(ch=='Y')
            {
                bo++;
            }
            else if(ch=='1'||ch=='3'||ch=='5')
            {
                if(bt==1)
                {
                    bt1 +=Character.getNumericValue(ch);
                    bo +=Character.getNumericValue(ch);
                    bt=2;
                }
                else
                {
                    bt2 +=Character.getNumericValue(ch);
                    bo +=Character.getNumericValue(ch);
                    bt=1;
                }
                bc++;
            }
            else if(ch=='2'||ch=='4'||ch=='6')
            {
                if(bt==1)
                {
                    bt1+=Character.getNumericValue(ch);
                    bo+=Character.getNumericValue(ch);
                }
                else
                {
                    bt2+=Character.getNumericValue(ch);
                    bo+=Character.getNumericValue(ch);
                }
                bc++;
            }
            else
            {
                System.out.println("Invalid");
                return;
            }
            if(bc==6)
            {
                break;
            }
        }
        System.out.println("BATSMAN 1: "+bt1);
        System.out.println("BATSMAN 2: "+bt2);
        System.out.println("BOWLER: "+bo);
        sc.close();
    }
}