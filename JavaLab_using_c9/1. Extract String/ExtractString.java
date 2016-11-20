import java.io.*;
import java.util.Scanner;

public class ExtractString {
    public static void main(String args[])  {
    String str,substr;
    int idx1,idx2;
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the String : ");
    str=in.next();
    System.out.println("Enter the index 1 : ");
    idx1 = in.nextInt();
    System.out.println("Enter the index 2 : ");
    idx2 = in.nextInt();
    substr=str.substring(idx1,idx2);
    System.out.println("The Substring is : " + substr);    
    }
}