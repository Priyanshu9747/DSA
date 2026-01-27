// import java.util.*;
// public class ConditionalStatements{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out .println("Enter age :- ");
//         int age=sc.nextInt();
//         if(age>=18){
//             System.out.println("Adult");
//         }
//         else if(age>13 && age<18){
//             System.out.println("teenagr");
//         }
//         else{
//             System.out.println("child");
//         }

//     }

// }

 
//          find greatest number among 2
//   import java.util.*;
//  public class ConditionalStatements {
//      public static void main(String args[]){
//          Scanner sc=new Scanner(System.in);
//          double num1=sc.nextDouble();
//           double num2=sc.nextDouble();
//           if(num1>=num2){
//             System.out.println("num1 is greater");
//           }
//           else{
//             System.out.println("num2 is greater");
//           }

//      }
// }


//         find number is even or odd
// import java.util.*;
//  public class ConditionalStatements {
//      public static void main(String args[]){
//          Scanner sc=new Scanner(System.in);
//          System.out.println("Enter the number  ");
//          double num1=sc.nextDouble();
//          if (num1%2==0){
//           System.out.println("number is even");
//          }
//          else {
//           System.out.println("number is odd");
//          }
         
//      }
//     }    




         //income tax calculator
// import java.util.*;
//  public class ConditionalStatements {
//      public static void main(String args[]){
//       Double tax;
//          Scanner sc=new Scanner(System.in);
//          System.out.println("Enter the Salary  ");
//          double Salary=sc.nextDouble();
//          if (Salary<500000){
//            tax=Salary*0;
//          }
//          else if(Salary>=500000 && Salary<=1000000L){
//            tax=Salary*(0.2);
//          }
//          else{
//            tax=Salary*(0.3);
//          }
//          System.out.println("tax over Salary is  " +tax);
//      }
//     }    




                //Find greatest of three numbers
// import java.util.*;
//  public class ConditionalStatements {
//      public static void main(String args[]){
      
//          Scanner sc=new Scanner(System.in);
//          System.out.println("Enter three numbers  ");
//          double num1=sc.nextDouble();
//          double num2=sc.nextDouble();
//          double num3=sc.nextDouble();
//          if (num1 >num2  && num1>num3){
//            System.out.println("num1 is greater");
//          }
//          else if(num2>num1 && num2>num3){
//            System.out.println("num2 is greater");
//          }
//          else{
//            System.out.println("num3 is greater");
//          }
         
//      }
//     }    



        //TERNARY OPERATOR
// import java.util.*;
// public class  ConditionalStatements {
//   public static void main (String args[]){
//     int x=(75>=34)? 75:34; 
//     String isEven=(6%2==0)? "even" : "odd";             //ternary operator
//     boolean larger = (!true == true);
 
     
//     System.out.println(x);
//     System.out.println(larger);
//     System.out.println(isEven);
    
//     // Scanner sc=new Scanner(System.in);
//     // System.out.println("Enter marks of student ");
//     // int marks=sc.nextInt();
//     // String Result=(marks>=33)? "pass" : "fail";  
//     // System.out.println(Result);
//   }
// }



          //Switch
// import java.util.*;
// public class  ConditionalStatements {
//   public static void main (String args[]){
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter number of day");
//    int day=sc.nextInt();
   
   
//    switch(day){
    
    // case 1:System.out.println("monday  ");;
    // break;

    // case 2:System.out.println("tuesday  ");;
    // break;

    // case 3:System.out.println("wednesday  ");;
    // break;

    // case 4:System.out.println("thrusday  ");;
    // break;

    // case 5:System.out.println("friday  ");;
    // break;

//     case 6:System.out.println("saturday ");;
//     break;

//     case 7: System.out.println("sunday ");
//     break;

//     default: System.out.println("Gaandmasti mat kar lawde!");
//     break;
//    }

   

//   }
// }




          //calculator design using Switch statements
// import java.util.*;
// public class  ConditionalStatements {
//   public static void main (String args[]){
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter 1st number");
//    double num1 =sc.nextDouble();
//    System.out.println("enter 2nd number");
//    double num2 =sc.nextDouble();
//    char operators=sc.next().charAt(0);

//    switch(operators){

//     case '+' : System.out.println(num1+num2);
//     break;

//     case '-':System.out.println(num1-num2);;
//     break;

//     case '*':System.out.println(num1*num2);;
//     break;

//     case '/':System.out.println(num1/num2);;
//     break;

//     case '%':System.out.println(num1%num2);;
//     break;

//     default:{
//       System.out.println("wtong opihvewuofjioew");
//     }
//     }
//    }

// }
