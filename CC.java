import java.io.*;
import java.util.*;
public class CC{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String A=a.toUpperCase();
StringBuffer b=new StringBuffer(A);
b.deleteCharAt(0);
String c=b.toString();
String C=c.toLowerCase();
System.out.print(A.charAt(0)+""+C);
}}
