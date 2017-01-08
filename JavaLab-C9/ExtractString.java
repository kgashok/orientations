import java.util.Scanner;

/*
 @Purpose   : Find the substring of a string given the start and end index numbers. 
 */
public class ExtractString {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);  

    System.out.println("Enter the String : ");
    String string = sc.next(); 
    System.out.println("Enter the index 1 : ");
    int beginIndex = sc.nextInt();
    System.out.println("Enter the index 2 : ");
    int endIndex = sc.nextInt();
    
    String subString = string.substring(beginIndex, endIndex);
    System.out.println("The Substring is : " + subString);
  }
}
