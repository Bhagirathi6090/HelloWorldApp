
public class String8 {
public static void main(String[]args) {
	String s1 ="Hello";
	int i = s1.length();
	byte b[] = new byte[i];
	b = s1.getBytes();
	for(int j=0; j<i; j++) {
		System.out.println(b[j]);
	}
}
}
