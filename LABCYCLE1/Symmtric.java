import java.util.Scanner;
class Symmteric{
        public static void main(String args[]){
                int rows,cols,i,j,issymmteric=0;
                Scanner n=new Scanner(System.in);
                System.out.println("enter the no of rows: ");
                rows=n.nextInt();
                System.out.println("enter the no of columns: ");
                cols=n.nextInt();
                int num1[][]=new int[rows][cols];
                System.out.println("enter the elements of matrix: ");
                for(i=0;i<rows;i++)
                        for(j=0;j<cols;j++)
                                num1[i][j]=n.nextInt();
                if(rows!=cols)
                        System.out.println("not symmetric");
                else{
                        for(i=0;i<rows;i++)
                                for(j=0;j<cols;j++)
                                        if(num1[i][j]!=num1[j][i]){
                                                issymmteric=1;break;
                                        }
                        if(issymmteric==0)
                                System.out.println(" symmetric");
                        else
                                System.out.println("not symmetric");
                }
        }
}

