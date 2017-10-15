import java.io.*;
import java.util.*;
public class revvow{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
StringBuffer b=new StringBuffer(a);
b.reverse();
System.out.println(b);
String c="AEIOUaeiou";
int i,j,count=0;
for(i=0;i<b.length();i++)
{
for(j=0;j<c.length();j++)
{
if(b.charAt(i)==c.charAt(j))
{
b.deleteCharAt(i);
count++;
}
}
if(count>0)
{
i--;
count=0;
}
}
System.out.print(b);
}}
