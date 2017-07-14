import java.io.*;
import java.util.*;
public class factorial{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i,sum=1;
for(i=1;i<=a;i++)
{
sum=sum*i;
}
System.out.print(sum);
}}
