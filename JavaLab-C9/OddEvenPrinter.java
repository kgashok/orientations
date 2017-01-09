/**
* Program to print odd-even numbers alternately.
* This is a classic example of Producer-Consumer threads.
*
* There are two threads:
* OddThread: printing odd number
* EvenThread: printing even number
*
* The threads are executed alternately by using wait-notify
* mechanism. A lock object is used for waiting and notifying
* the two threads one by one.
*
* We are printing the numbers from 1 to LIMIT.
*
* @author sumit.ambhore
*/
public class OddEvenPrinter {

  public final static int LIMIT = 50;

  public static void main(String[] args) throws InterruptedException {
    // lock object for calling wait() and notify()
    Object lock = new Object();

    // need to pass the lock object in both the threads so that
    // wait() and notify() would be called on the same object
    EvenThread et = new EvenThread(lock, "EvenThread");
    OddThread ot  = new OddThread(lock, "OddThread");

    ot.start(); // start OddThread

    // sleep main thread for some time to ensure that OddThread
    // would run first, as our starting number is 1 i.e. odd.
    Thread.sleep(1000);

    et.start(); // start EvenThread
  }
}

class EvenThread extends Thread {

  private Object lock = null;
  public String name; 

  public EvenThread(Object lock, String s) {
    this.lock = lock;
    name = s;
  }

  @Override
  public void run() {
    synchronized (lock) {
      try {
        // need to start for loop from number 2 and
        // need to increment i by 2 for even numbers
        for (int i = 2; i <= OddEvenPrinter.LIMIT; i = i + 2) {
          System.out.println(name + ": " + i); // print even number
          lock.notify(); // notify waiting OddThread
          lock.wait(); // wait EvenThread
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    } // end of synchronized 
  }  // end of run
} // end of EvenThread

class OddThread extends Thread {

  private Object lock = null;
  public String name; 

  public OddThread(Object lock, String s) {
    this.lock = lock;
    name = s;
  }

  @Override
  public void run() {
    synchronized (lock) {
      try {
        // need to start for loop from number 1 and
        // need to increment i by 2 for odd numbers
        for (int i = 1; i <= OddEvenPrinter.LIMIT; i = i + 2) {
          System.out.println(name + ": " + i); // print odd number
          lock.notify(); // notify waiting EvenThread
          lock.wait(); // wait OddThread
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    } // end of synchronized 
  } // end of run
} // end of OddThread
