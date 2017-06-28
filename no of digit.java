import java.util.*;
class no of digit
{
public static void main(String args[])
{
int n,count=0; 
Scanner sc=new scanner(System.in);
n=sc.nextInt();
if(n<0)
{
n=n*-1;
}
while(n>0)
{
n=n/10;
count++;
}
System.out.println(count);
}
}
