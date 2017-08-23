import java.io.*;
import java.util.*;
class arm{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int i,j,sum=0,mul=1,ch;
for(i=0;i<a.length();i++){
for(j=0;j<a.length();j++){
mul=mul*(a.charAt(i)-'0');
}
sum=sum+mul;
mul=1;
}
ch=Integer.parseInt(a);
if(ch==sum)
System.out.print("the given number is a armstrong number");
else
System.out.print("the given number is not a armstrong number");
}}
