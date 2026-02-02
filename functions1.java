// public class functions1 {
//     static void myMethod() {
//     System.out.println("I am priyanshu Sahu");
//   }

//   public static void main(String[] args) {
//     myMethod();
//     myMethod();
//     myMethod();
//   }
// }






// public class functions1 {
//   static void myMethod(String fname, int age) {
//     System.out.println(fname + " is " + age);
//   }

//   public static void main(String[] args) {
//     myMethod("Liam", 5);
//     myMethod("Jenny", 8);
//     myMethod("Anja", 31);
//   }
// }





import java.util.Scanner;

public class functions1 {

  // Create a checkAge() method
  static void checkAge(int age) {

    // If age is less than 18
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");
    }
    // If age is 18 or more
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {

    // Take input from user
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    // Call the method with user input
    checkAge(age);

    sc.close();
  }
}


