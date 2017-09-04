import java.io.*;
import java.util.*;
public class rotate{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b[]=a.split(" ");
int g;
int k=s.nextInt();
int c[]=new int[b.length];
if(k<=b.length)
{
for(int i=0;i<b.length;i++)
{
a=b[i];
g=Integer.parseInt(a);
if(i+k<b.length)
c[i+k]=g;
else
c[(i+k)-b.length]=g;
}
for(int i=0;i<c.length;i++)
System.out.print(c[i]+" ");
}
else
System.out.print("Invalid key value");
}}
