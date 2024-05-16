package logic_program;

public class String_change {

	public static void main(String[] args) {
		//String $2000 using arithmatic operation to make it as $2001
		String num ="$2000";
		int value = Integer.parseInt(num.substring(1));	 //string into integer 
		value=value+1;
		String updated="$" +value;
		System.out.println(updated);
	}

}
