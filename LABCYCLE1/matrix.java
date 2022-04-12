import java.util.*;
class arr
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,j,row,col;
System.out.println("Enter the no. of rows:");
row=s.nextInt();
System.out.println("Enter the no. of columns:");
col=s.nextInt();
int mat[][]=new int[row][col];
System.out.println("Enter the elements of the matrix:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat[i][j]=s.nextInt();
}
}
System.out.println("The matrix :");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.println(mat[i][j]+"\t");
}
System.out.println();
}
}
}
