
public class String1 {
	public static void main (String[]args){
		byte array [] = {65,66,67,68,69,70};
		String on = new String(array);
		String no = new String(array,2,3);
		System.out.println(no);
		System.out.println(on);
		
	}

}
