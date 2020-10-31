public class Swap {
 /*write a program that can swap two variables' values wihtout using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10
*/
 public static void main(String[] args) {  // I DONT UNDERSTAND

     int a = 10;
     int b = 15;

     a = a+b; //25
     b = a-b; //10
     a = a-b; //15
     System.out.println("a = "+a);
     System.out.println("b = "+b);



 }
}
