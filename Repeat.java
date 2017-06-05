import java.io.*;
import java.util.*;
class Repeat
{
    public static void main(String args[])
    {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []a1=new int[n];
int flag=0;
for(int i=0;i<n;i++)
{
a1[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a1[i]==a1[j])
{
flag=1;
System.out.println(a1[j]);
}
}
}
}
}

