
public class String3 {
 public static void main(String[]args) {
	 char ss[] = {'A','B','C','D'};
	 String on = new String(ss);
	 String no = new String(ss,2,2);
	 System.out.println(no);
	 System.out.println(on);
 }
}
