/*
@Purpose     : Implement multiple inheritance using Interfaces. 
 */
class Student {
  int rollNo;
  String name = "Smith Jones";

  void setRollNumber(int rollNumber) {
    rollNo = rollNumber;
  }

  void printStudentDetails() {
    System.out.println("RollNo   :  " + rollNo);
    System.out.println("Name     :  " + name);
  }
}

class StudentTest extends Student {
  int mark1, mark2;

  void setMarks(int firstMark, int secondMark) {
    mark1 = firstMark;
    mark2 = secondMark;
  }

  public void printMarks() {
    System.out.println("Mark1    :  " + mark1);
    System.out.println("Mark2    :  " + mark2);
  }
}

interface Sports {
  int sportsMark = 75;
  void printSportsMark();  // needs to overridden in implementing class
}

class Result extends StudentTest implements Sports {
  int totalMarks;

  public void printSportsMark() {
    System.out.println("\n\nSports Marks   :" + sportsMark);
  }

  void displayTotalMarks() {
    totalMarks = mark1 + mark2 + sportsMark;
    System.out.println("\tSCORE CARD");
    printStudentDetails(); // invoking parent "Students" class method
    printMarks();          // invoking derived "StudentTest" class method
    printSportsMark();     // invoking Implemented "Sports" class method
    System.out.println("Total Marks    :" + totalMarks);
  }
}

class MultipleInheritance {
  public static void main(String args[]) {
    Result studentResult = new Result();
    studentResult.setRollNumber(1000);
    studentResult.setMarks(75, 100);
    studentResult.displayTotalMarks();
  }
}
