/*
@Purpose     : Implement multiple interface using Interfaces. 
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

  void printSportsMark();
}

class Result extends StudentTest implements Sports {
  int totalMarks;

  public void printSportsMark() {
    System.out.println("SportMark=" + sportsMark);
  }

  void displayTotalMarks() {
    totalMarks = mark1 + mark2 + sportsMark;
    System.out.println("\tSCORE CARD");
    printStudentDetails();
    printMarks();
    System.out.println("\n\nSports Marks   :" + sportsMark);
    System.out.println("Total Marks    :" + totalMarks);
  }
}

class MultipleInheritance {
  public static void main(String args[]) {
    Result studentObject = new Result();
    studentObject.setRollNumber(1000);
    studentObject.setMarks(75, 100);
    studentObject.displayTotalMarks();
  }
}
