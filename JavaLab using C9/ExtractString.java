import java.util.Scanner;

/*
 @Purpose   : Find the substring of a string given the start and end index numbers. 
 */
public class ExtractString {
	public static void main(String args[]) {
		String string, subString;
		int firstIndex, secondIndex;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		string = in.next();
		System.out.println("Enter the index 1 : ");
		firstIndex = in.nextInt();
		System.out.println("Enter the index 2 : ");
		secondIndex = in.nextInt();
		subString = string.substring(firstIndex, secondIndex);
		System.out.println("The Substring is : " + subString);
	}
}
