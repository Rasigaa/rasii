import java.io.*;
import java.util.*;
public class repeat{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b[]=a.split(" ");
String h=new String();
String y=new String();
int i;
for(i=0;i<b.length-1;i++)
{
h=b[i];
y=b[i+1];
if(h.equals(y))
{
System.out.print(h);
break;
}
}
}}
