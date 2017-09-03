import java.io.*;
import java.util.*;
public class zero{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b[]=a.split(" ");
String d=new String();
int c[]=new int[b.length];
int i,n=0,p=0;
for(i=0;i<b.length;i++)
{
d=b[i];
c[i]=Integer.parseInt(d);
}
Arrays.sort(c);
for(i=0;i<c.length;i++)
{
if(c[i]>0){
p=c[i];
n=c[i+1];
break;
}
}
System.out.print(n+""+p);
}
}
