import java.io.*;
import java.util.*;
public class integer{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b[]=a.split(" ");
String h=new String();
int ar[]=new int[b.length];
int i;
for(i=0;i<ar.length;i++)
{
h=b[i];
ar[i]=Integer.parseInt(h);
}
Arrays.sort(ar);
for(i=0;i<ar.length;i++)
{
if(ar[i]==i)
System.out.print(i);
}
}}
