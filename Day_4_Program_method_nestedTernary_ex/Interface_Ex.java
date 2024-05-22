interface vechical
{
	void noofwheels();
}
class Car implements vechical
{
	public void noofwheels() {
		System.out.println("four wheeler");
	}
	void speed()
	{
		System.out.println("90/km per hour");
	}
}
public class interface_Ex {

	public static void main(String[] args) {
		Car c=new Car();
		c.noofwheels();
		c.speed();
		
		

	}

}
