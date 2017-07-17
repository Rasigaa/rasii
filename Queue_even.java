import java.io.*;
import java.util.*;
public class Queue_even{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String w[]=a.split(" ");
int i;
List<String> Qe=new ArrayList<String>(Arrays.asList(w));
while(Qe.size()!=1)
{
for(i=0;i<Qe.size();i++)
{
if((i%2)==0)
{
Qe.remove(i);
Qe.add(i,"odd");
}
}
int len=Qe.size();
for(i=0;i<len;i++)
{
Qe.remove("odd");
}
}
System.out.print(Qe);
}}
