class CPU{
        double price=8000;
        void display_1(){
                Processor obj_2=new Processor();
                obj_2.display_2(); 
        }

        class Processor{
        int no_of_cores=10;
        String pross_manufact="intel";
        void display_2(){
                System.out.println("Processor manufacturer:" + pross_manufact);
                System.out.println("No of cores:" + no_of_cores);
                System.out.println("Price:" + price);
                RAM obj=new RAM();
                obj.display();
        }
        }

        static class RAM{
                String memory="32 GB RAM";
                String mmry_manufact="samsung";
                void display(){
                        System.out.println("Memory  manufacturer:" + mmry_manufact);
                        System.out.println("Memory:" + memory);
                }
        } 


}
class Demoo{
        public static void main(String args[]){
                CPU obj1=new CPU();
                obj1.display_1();
        }
}
