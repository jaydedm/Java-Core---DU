
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		
		//-----------------------------
		// decimals
		//-----------------------------
		int x = 10;
		int y = 20;
		
		// Example of displaying integers
		// X:10 Y:20
		//System.out.printf("", ...);       
		
		// TODO: Format number with 4 places and right justify using spaces
		// X:  10 Y:  20
		String s1 = String.format("X:%4d Y:%4d", x, y);
		System.out.println(s1);
		//System.out.printf("", ...);    
		
		// TODO: Format number with 4 places and pad with zeros
		// X:0010 Y:0020
		//System.out.printf("", ...);
		String s2 = String.format("X:%04d Y:%04d", x, y);
		System.out.println(s2);
		
		// TODO: Format number with 4 places and left justify using spaces
		// X:10   Y:20
		//System.out.printf("", ...);
		String s3 = String.format("X:%-4dY:%-4d",x,y);
		System.out.println(s3);
		
		// TODO: Format number using comma separator
		// X:1,234,567
		//System.out.printf("", ...);
		String s4 = String.format("%,d", 1234567);
		System.out.println(s4);
		
		// TODO: Format number leaving a space placeholder for positive numbers and prefixing with - for negative numbers
		// X: 10 Y:-20
		//System.out.printf("", ...);
		String s5 = String.format("X:% d Y:-%d",x,y);
		System.out.println(s5);
		
		// TODO: Format number by placing negative numbers in parenthesis
		// X:10 Y:(20)
		//System.out.printf("", ...);
		String s6 = String.format("X:%d Y:%(d",x,-y);
		System.out.println(s6);
		
		//-----------------------------
		// float
		//-----------------------------
		double pi = Math.PI;
		
		// TODO: Format floating point number to display only first 2 decimal places
		// 3.14
		//System.out.printf("", ...);
		String s7 = String.format("%.2f", pi);
		System.out.println(s7);
		
		//-----------------------------
		// dates
		//-----------------------------
		Calendar c = Calendar.getInstance();
		c.set(2016, 8, 1, 14, 0, 0);
		
		// TODO: Display date as 'September 01, 2016 at 2pm'
		//System.out.printf("", ...); 

		SimpleDateFormat format = new SimpleDateFormat(("MMMM 0d, yyyy 'at' h a"));
		System.out.println(format.format(c.getTime()));

		//-----------------------------
		// toString
		//-----------------------------
		// TODO: Override the toString method in the Person class to display the name
		// as 'Doe, John'
		Person person = new Person("John", "Doe");
		//System.out.printf("", ...); 
		System.out.println(person.toString());
	}
	
	
	
}