import java.io.*;
import java.util.*;
public class Isnumeric{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int k=0;
for(int i=0;i<a.length();i++)
{
if((int)(a.charAt(i))<123&&(int)(a.charAt(i))>64)
{}
else
k++;
}
if(k!=0)
System.out.print("true");
else
System.out.print("false");
}}
