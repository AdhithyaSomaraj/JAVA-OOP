import java.util.*;
class matrixadd
{
public static void main(String args[])
{
int row,col,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no. of rows:");
row=s.nextInt();
System.out.println("Enter the no. of columns:");
col=s.nextInt();
int a[][]=new int[row][col];
System.out.println("Enter the elements of matrix:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
a[i][j]=s.nextInt();
}
}
int b[][]=new int[row][col];
System.out.println("Enter elements of 2nd matrix:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
b[i][j]=s.nextInt();
}
}
int c[][]=new int[row][col];
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("Resultant matrix addition:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(c[i][j]+"\t ");
}
System.out.println();
}
}
}

