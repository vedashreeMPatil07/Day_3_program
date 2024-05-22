package overloading;
import overloading.File_overloading;
public class Main_overloading {

	public static void main(String[] args) {

		
File_overloading  fo =new File_overloading();

        File_overloading.area(10, 15);
        File_overloading.area(10);
        fo.area(10.00); //static member access
        File_overloading.area(10, 20, 50); 
	}

}
