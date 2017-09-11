import java.io.*;
import java.util.*;
public class password{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b=s.nextLine();
int i,dif;
if(a.length()>b.length()){
dif=a.length()-b.length();
for(i=1;i<=dif;i++)
b=b+String.valueOf(i);
}
else
{
dif=b.length()-a.length();
for(i=1;i<=dif;i++)
a=a+String.valueOf(i);
}
for(i=0;i<a.length();i++)
{
System.out.print(a.charAt(i));
System.out.print(b.charAt(i));
}
}}
