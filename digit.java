import java.io.*;
import java.util.*;
class digit
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int b=0;
while(n!=0)
{
b=b*10;
b=b+n%10;
n=n/10;
}
System.out.println(b);
}
}
