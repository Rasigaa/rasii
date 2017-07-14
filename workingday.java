import java.io.*;
import java.util.*;
public class workingday{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String c=a.toLowerCase();
String b="sunday";
if(b.equals(c))
System.out.print("not working day");
else
System.out.print("workingday");
}}
