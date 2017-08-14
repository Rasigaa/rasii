import java.io.*;
import java.util.*;
public class Binary{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i,j,n,t=0,count=0,temp=0;
String a=s.nextLine();
String b[]=a.split(" ");
String r=new String();
int o[]=new int[b.length];
int w[]=new int[b.length];
for(i=0;i<b.length;i++)
{
r=b[i];
n=Integer.parseInt(r);
w[i]=n;
do
{
if((n%2)==1){
count++;
}
n=n/2;
}
while(n>3);
count=count+(n/2)+(n%2);
o[i]=count;
count=0;
}
int z[]=new int[o.length];
for(j=0;j<o.length;j++)
{
for(i=0;i<o.length;i++)
{
if(o[j]<o[i])
t++;
}
if(z[t]==0)
z[t]=w[j];
else if(w[j]>z[t])
{
temp=z[t];
z[t]=w[j];
z[t+1]=temp;
}
else
z[t+1]=w[j];
t=0;
}
for(i=0;i<z.length;i++)
System.out.println(z[i]+" ");
}
}
