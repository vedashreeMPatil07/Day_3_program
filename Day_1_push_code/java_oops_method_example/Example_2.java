
public class Example_2 {
public static double calculateArea(double length, double width) {
	return length*width;
}
	public static void main(String[] args) {
	double length=5.0;
	double width=3.0;
	
	double area= calculateArea(length,width);
	
	System.out.println("the area of the rectanglewith length"+length+"and width"+width+"is:"+area);

	}

}
