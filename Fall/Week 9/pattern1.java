import java.io.*;
public class pattern1
{
public static void main (String[] args) throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int i,j,n=0,k;
System.out.print("How many stars you want to print in first row ? ");
n=Integer.parseInt(in.readLine());
for (i = 0; i<n; i=i+2)
{
for (j=i; j<n;j++)
System.out.print ("*");
System.out.println();
}
}
}