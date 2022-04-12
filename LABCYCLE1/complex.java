import java.util.*;
class complex{
        int real,imaginary;
        complex(){}
        complex(int r,int i){
                real=r;imaginary=i;
        }
        complex addcomp(complex c1,complex c2)
        {
                complex tmp=new complex();
                tmp.real=c1.real+c2.real;
                tmp.imaginary=c1.imaginary+c2.imaginary;
                return tmp;
        }
}
class demo{
        public static void main(String a[]){
                int r1,r2,i1,i2;
                Scanner s=new Scanner(System.in);
                System.out.println("Enter the real & imaginary for 1st object:");
                r1=s.nextInt();
                i1=s.nextInt();
                complex c3= new complex(r1,i1);
                System.out.println("Complex no1: "+c3.real+" +i"+c3.imaginary);
                System.out.println("Enter the real & imaginary for 2nd object:");
                r2=s.nextInt();
                i2=s.nextInt();
                complex c4= new complex(r2,i2);
                System.out.println("Complex no1: "+c4.real+" +i"+c4.imaginary);
                complex c5=new complex();
                c5 = c5.addcomp(c3,c4);
                System.out.println("Sum of Complex nos: "+c5.real+" +i"+c5.imaginary);

        }
}


