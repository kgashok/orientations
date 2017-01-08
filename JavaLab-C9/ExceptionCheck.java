import java.util.Scanner;
import java.io.IOException;

/*
 @Purpose - This program throws an exception when the payout is out of bounds. 
 */
public class ExceptionCheck {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n\nCHECK PAY MODULE");
    System.out.println("* * *");
    System.out.println("\n Enter a Basic Pay Amount   : ");
    int payAmount = Integer.parseInt(sc.nextLine()); 

    /*
     * A piece of code enclosed within a try - catch block will be handled by
     * the Exception Handler
     */
    try {
      if (payAmount > 1000)
        throw new PayOutOfBoundException("Basic Pay is Out of Bound");
      else
        System.out.println("\n Given Basic Pay is:" + payAmount);
    } catch (Exception exception) {
      System.out.println("Caught:" + exception);
    }
  }
}

class PayOutOfBoundException extends IOException {
  private static final long serialVersionUID = 1L;

  PayOutOfBoundException(String message) {
    System.out.println("\nOOPS!!!! -----   " + message);
  }
}
