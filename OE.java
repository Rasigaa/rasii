import java.io.*;
import java.util.*;
public class OE{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int i;
String o=new String();
String e=new String();
if(a.length()%2==0){
for(i=0;i<a.length();i++)
{
if(i%2==0)
o=o+String.valueOf(a.charAt(i));
else
e=e+String.valueOf(a.charAt(i));
}
for(i=0;i<o.length();i++)
System.out.print(e.charAt(i)+""+o.charAt(i));
}
else
System.out.print("invalid input: please enter a String of length which is a even number to make swapping ossible");
}}
