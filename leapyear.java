import java.util.*;
class leapyear
{
    public static void main(String args[])
    {int x=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%400==0)||((a%4==0)&&(a%100!=0)))
        {
            System.out.print("leapyear");
            
        }
        else
        {
            System.out.print("not leapyear");
        }
    }
}
