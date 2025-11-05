// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// שלושת השמות
	   	String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

		// סכום החשבון
		int Bill = Integer.parseInt(args[3]);

		// חישוב כמה כל אחד משלם
		double each = Math.ceil(Bill/3.0);
	   
		// הדפסה
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + each + " Shekels each");
		
		// end  
	}
}
