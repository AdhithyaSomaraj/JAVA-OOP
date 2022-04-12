import java.util.*;
class product{
        int pcode;
        String pname;
        double price;
        void setdata(int code,String name,double prices){
                pcode=code;
                pname=name;
                price=prices;
        }
        void getdata()
        {
                System.out.println("Product name:"+pname);
                System.out.println("Product code:"+pcode);
                System.out.println("Product price:"+price);
        }
        void lowprice(product p1,product p2){
                if(price<=p1.price && price<=p2.price)System.out.println(price+" has smallest value");
                else if(p1.price<=price && p1.price<=p2.price)System.out.println(p1.price+" has smallest value");
                else System.out.println(p2.price+" has smallest value");
        }
}
class prod{
        public static void main(String a[]){
                Scanner s=new Scanner(System.in);
                product obj1=new product();
                product obj2=new product();
                product obj3=new product();
                obj1.setdata(10,"Xyleux",20);
                obj2.setdata(15,"Ahims",25);
                obj3.setdata(5,"aadi",10);
                obj1.getdata();
                obj2.getdata();
                obj3.getdata();
                obj1.lowprice(obj2,obj3);
        }
}

