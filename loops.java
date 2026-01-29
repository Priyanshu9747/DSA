                                                     //WHILE LOOP
// public class loops {
//     public static void main(String args[]){
//         int a=0;                                         //initializing variable
//         while(a<=5){
//             System.out.println("Priyanshu Sahu");
//             a++;                                          //increment of vaariable number
//         }

//     }
    
// }


         //Print numbers from 1 to 10
// public class loops {
//     public static void main(String args[]){
//         int a=1;
//         while(a<=10){
//             System.out.println(a);
//             a++;
//         }

//     }
    
// }
     



             //Print numbers from 1 to n
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter the value of n :- " );
//      int n=sc.nextInt();
//         int a=1;
//         System.out.println("count from 1 to n :- " );
//         while(a<=n){
//             System.out.print(a + " ");
//             a++;
//         }

//     }
    
// }


         //SUM OF FIRST N NATURAL NUMBER
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter the value of n :- " );
//      int n=sc.nextInt();
//         int a=1;
//         int sum=0;
//         System.out.println("count from 1 to n :- " );
//         while(a<n){
//             System.out.println(a + " ");
//             sum=sum+a;
//             a++;
            

//         }
//         System.out.println("sum of first n natural numbers\n" +sum);
//     }
    
// }


                                            //FOR LOOP
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
     
//         for(int i=0; i<5; i++){
//             System.out.println("hello World");
//         }


//     }
        
// }
    


    //Print Square star pattern
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
        
//         for(int i=0; i<4; i++){                      //loop for no. of lines
//            System.out.println("* * * *");
//         }

//     }
// }
    
          //Print reverse of a number  
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int a;
    

//         while(num>0){
//             a=num%10;
//             System.out.print(a);
//             num=num/10;
//         }
        
        
//     }
// }


        //Reverse a given number

// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number to reverse");
//         int num=sc.nextInt();
//         int rev=0;
//         int a;

//         while(num>0){
//             a=num%10;
//             rev=(rev*10)+a;
//             num/=10;


//         }

//         System.out.println(rev);
    
//     }
// }
   



                                              //DO WHILE loop
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         int a=1;
//         do{
//             System.out.println("hello World");
//             a++;
            
//         } while(a<9);
        
//     }
// }       




//BREAK STATEMENT
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         for(int i=0; i<6; i++){
//             if(i==4){
//                 break;                    //value printed till 3 only

//             }
//             System.out.println(i);
           
//         }
//     }
// }



     //keep entering number till user enters multiple of 10
// import java.util.*;
// public class loops{
//     public static void main(String main[]){
//         Scanner sc=new Scanner(System.in);
        
//         do{
//            int num=sc.nextInt();
//            if(num%10==0){
//             break;
//            }
//            System.out.println(num);  
//         }while(true);

//         }    

//     }




         //CONTINUE STATEMENT
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         for(int i=0; i<6; i++){
//             if(i==4){
//                 continue;                    //skip no. i==4

//             }
//             System.out.println(i);
           
//         }
//     }
// }




// display all numbers entered by user except multiple of 10
// import java.util.*;
// public class loops{
//     public static void main(String main[]){
//         Scanner sc=new Scanner(System.in);
        
//         do{
//            int num=sc.nextInt();
//            if(num%10==0){
//             continue;
//            }
//            System.out.println(num);  
//         }while(true);

//         }    

//     }



import java.util.*;
public class loops{
    public static void main(String main[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                isPrime=false;
            }

        }
        if(isPrime==true){
            System.out.println("Prime");
        }
        else{

            System.out.println("not Prime");
        }

    }    
}
