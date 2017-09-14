import java.io.*;
import java.util.*;
public class lp{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
s.nextLine();
String a[]=new String[100];
int i,j,count=0;
for(i=0;i<n;i++)
a[i]=s.nextLine();
String b=a[0];
String c=new String();
String d=new String();
for(i=0;i<b.length();i++)
{
for(j=1;j<n;j++)
{c=a[j];
if(b.charAt(i)==c.charAt(i))
count++;
}
if(count==n-1)
d=d+String.valueOf(b.charAt(i));
else
break;
count=0;
}
System.out.print(d);
}}
