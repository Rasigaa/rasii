import java.io.*;
import java.util.*;
public class as{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i;
String b[]=s.nextLine().split(" ");
String h=new String();
int c[]=new int[b.length];
for(i=0;i<b.length;i++)
c[i]=Integer.parseInt(b[i]);
Arrays.sort(c);
for(i=0;i<c.length/2;i++)
h=h+String.valueOf(c[c.length-1-i])+String.valueOf(c[i]);
System.out.print(h);
for(i=0;i<h.length();i++)
{
boolean d=h.contains(String.valueOf(c[i]));
if(d==false)
System.out.print(c[i]);
}
}}
