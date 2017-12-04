
public class String5 {
public static void  main(String[]args) {
	String s = "Now is the time for all good man"+"to come tothe aid of their country"+"and pay their tax";
	String s1 = "Hello World";
	String s2 = "hello";
	String s3 = "HELLO";
	String s4 = "time";
	System.out.println(s.indexOf('t'));
	System.out.println(s.indexOf('t',10));
	System.out.println(s.lastIndexOf('t',60));
	System.out.println(s1.substring(6));
	System.out.println(s2.concat("World"));
	System.out.println(s1.replace('l','o'));
	System.out.println(s2.toUpperCase());
	System.out.println(s4.trim());
	System.out.println(s1.startsWith(s3));
	System.out.println(s2.compareTo(s3));
	
			}
}
