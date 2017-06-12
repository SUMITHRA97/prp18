import java.io.*;
import java.util.*;
class alphaornot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if(s>='a'||s<='z'&&s>='A'||s<='Z')
        {
            System.out.print("alpha");
        }
        else
        {
            System.out.print("not alpha");
        }
    }
}
