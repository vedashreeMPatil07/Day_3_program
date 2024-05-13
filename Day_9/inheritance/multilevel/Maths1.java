package inheitance.multilevel;


    public  class Maths1  {
        void printAll(){
System.out.println("formula :");
System.out.println("ADD: A+B");
System.out.println("Sub: A-B");
}      
        class Add extends Maths1        {
            void sum()
            {
                int a =10;
                int b=20;
                int sum =a+b;
                System.out.println("sum: "+sum);
        }
        class Sub extends Maths1{
            void Sub()
            {
                int a =10;
                int b=20;
                int sub =a-b;
                System.out.println("sum: "+sub);
        }
        public class multilevel {
        public static void main(String[] args) {
             sum s =new sum();
            Sub s1=new Sub();
            s1.Sub(); s1.printAll();
            s.sum();   s.printAll();
    }
}
}
        }
              
