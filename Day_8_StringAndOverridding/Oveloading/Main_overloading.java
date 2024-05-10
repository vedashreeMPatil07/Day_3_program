package Oveloading;
import Oveloading.Overloading1;
public class Main_overloading {

    public static void main(String args[])
    {
        Overloading1  fo =new Overloading1();

        fo.area(length:10 ,breadth :15);
        fo.area(length:10);
        fo.area(radius:10.00);
       fo.area(length:10, breadth:10, hypotenious:10);
    }
}