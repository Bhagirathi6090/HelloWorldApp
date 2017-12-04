
public class String7 {
public static void main(String[]args) {
	String s1 = "Hello Java";
	char ch[] = new char[4];
	s1.getChars(1,3,ch,2);
	for(int i=0; i<4; i++) {
		System.out.println(ch[i]);
	}

}  //Doubt on this program
}
 