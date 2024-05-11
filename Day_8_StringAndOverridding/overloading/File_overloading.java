package overloading;

public class File_overloading {

	
	public static void area(int length , int breadth)
    {
        System.out.println(length*breadth);
    }
    public static void area(int length)
    {
        System.out.println(length*length);
    }
    public void area(double radius)
    {
        System.out.printf("%.2f" , radius*radius*Math.PI);
    System.out.println();
     }

     public static void area (int length ,int breadth , int hypotenious)
     {
        System.out.println(0.5 *(hypotenious+length+breadth));
}
}