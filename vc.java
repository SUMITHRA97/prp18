import java.util.*;
class vc
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s.toUpperCase();
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                c1++;
            }
            if(Character.isLetter(c))
            {
                c3++;
            }
        }
        System.out.println("Vowels:" +" "+c1);
        System.out.println("Consonants:" +" "+c3);
       
        
    }
}




