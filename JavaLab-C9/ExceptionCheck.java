import java.io.DataInputStream;
import java.io.IOException;

/*
 @Purpose - This program throws an exception when the payout is out of bounds. 
 */
public class ExceptionCheck {
	public static void main(String args[]) throws IOException {
		int payAmount;
		DataInputStream inputAmount = new DataInputStream(System.in);
		System.out.println("\n\nCHECK PAY MODULE");
		System.out.println("* * *");
		System.out.println("\n Enter a Basic Pay Amount   : ");
		payAmount = Integer.parseInt(inputAmount.readLine()); // This denotes the
																													// deprecated function
																													// DataInputStream
																													// Class.
		/*
		 * A piece of code enclosed within a try - catch block will be handled by
		 * the Exception Handler
		 */
		try {
			if (payAmount > 1000)
				throw new PayoutOfBoundException("Basic Pay is Out of Bound");
			else
				System.out.println("\n Given Basic Pay is:" + payAmount);
		} catch (Exception exception) {
			System.out.println("Caught:" + exception);
		}
	}
}

class PayoutOfBoundException extends IOException {
	private static final long serialVersionUID = 1L;

	PayoutOfBoundException(String message) {
		System.out.println("\nOOPS!!!! -----   " + message);
	}
}
