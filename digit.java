import java.io.*;
import java.util.*;
public class digit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b[]=a.split("");
int y[]=new int[b.length];
int i;
for(i=0;i<b.length;i++)
{
y[i]=Integer.parseInt(b[i]);
}
Arrays.sort(y);
int k=s.nextInt();
for(i=0;i<(y.length-k);i++)
{
System.out.print(y[i];
}
}}
