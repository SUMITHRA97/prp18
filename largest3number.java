import java.util.*;
class largest3number
{
    public static void main(String args[])
    {
        int x=0,y=0,z=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(x>y&&x>z)
        {
            System.out.print("first largest number");
        }
        if(y>z&&z>x)
        {
            System.out.print("second largest number");
        }
        if(z>x&&z>y);
        {
            System.out.print("third largset number");
        }
        
    
    }
}
