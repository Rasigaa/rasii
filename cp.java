import java.io.*;
import java.util.*;
public class cp{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b[]=a.split(" ");
Set<Integer> h=new HashSet<Integer>();
int c,i,j,count=0;
for(i=0;i<2;i++)
{
a=b[i];
c=Integer.parseInt(a);
for(j=1;j<=c;j++)
{
if(c%j==0){
if(j!=1){
h.add(j);
count++;
}
}
}
}
if(count==h.size())
System.out.print("a&b are coprime numbers");
else
System.out.print("a&b are not coprime numbers");
}}
