import java.util.*;
import java.lang.*;
import java.io.*;
class Divi
{
public static void main(String args[])
{
Scanner input=new Scanner("System.in");
int n=input.nextInt();
if(n%2==0)
{
System.out.println("Even");
}
else if(n%2!=0 && n>0)
{
System.out.println("Odd");
}
else
{
System.out.println("invalid");
}
}
}
