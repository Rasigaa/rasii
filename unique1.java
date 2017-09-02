import java.io.*;
import java.util.*;
public class unique1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b[]=a.split(" ");
int i,k=0,m=0;
int c[]=new int[b.length];
for(i=0;i<b.length;i++)
{
c[i]=Integer.parseInt(b[i]);
}
Arrays.sort(c);
for(i=0;i<c.length-1;i++)
{
if(c[i]==c[i+1])
{
i++;
k=k+2;
}
else
{
System.out.print(c[i]);
m++;
}}
if(k==c.length-1&&m==0)
System.out.print(c[c.length-1]);
}}
