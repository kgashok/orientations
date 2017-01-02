import java.lang.Thread;

/*
 @Purpose    : The purpose of this program is to implement multithreading using 3 threads
 */
class FirstThread extends Thread {
	public void run() {
		int firstNumber = 0, secondNumber = 2, result;
		for (firstNumber = 1; firstNumber <= 4; firstNumber++) {
			result = firstNumber * secondNumber;
			System.out.println("From thread FirstThread:" + firstNumber + "*"
					+ secondNumber + "=" + result);
		}
		System.out.println("====== \n Exit from FirstThread \n====== \n ");
	}
}

class SecondThread extends Thread {
	public void run() {
		int firstNumber, secondNumber = 3, result;
		for (firstNumber = 1; firstNumber <= 4; firstNumber++) {
			result = firstNumber * secondNumber;
			System.out.println("From thread SecondThread: " + firstNumber + "*"
					+ secondNumber + "=" + result);
		}
		System.out.println("====== \n Exit from SecondThread \n====== \n ");
	}
}

class ThirdThread extends Thread {
	public void run() {
		int firstNumber, secondNumber = 5, result;
		for (firstNumber = 1; firstNumber <= 4; firstNumber++) {
			result = firstNumber * secondNumber;
			System.out.println("From ThirdThread :" + firstNumber + "*" + firstNumber
					+ "=" + result);
		}
		System.out.println("====== \n Exit from ThirdThread \n====== \n ");
	}
}

class ExampleMultiThreading {
	public static void main(String args[]) {
		int tempPriority = 0;
		FirstThread firstThreadObj = new FirstThread();
		SecondThread secondThreadObj = new SecondThread();
		ThirdThread thirdThreadObj = new ThirdThread();
		firstThreadObj.setPriority(Thread.MAX_PRIORITY);
		secondThreadObj.setPriority(firstThreadObj.getPriority() + tempPriority);
		thirdThreadObj.setPriority(Thread.MIN_PRIORITY);
		secondThreadObj.setPriority(firstThreadObj.getPriority() + tempPriority);
		thirdThreadObj.setPriority(Thread.MIN_PRIORITY);
		System.out.println("----\nStart thread FirstThread\n----");
		firstThreadObj.start();
		System.out.println("----\nStart thread SecondThread\n----");
		secondThreadObj.start();
		System.out.println("----\nStart thread ThirdThread\n----");
		thirdThreadObj.start();
	}
}
