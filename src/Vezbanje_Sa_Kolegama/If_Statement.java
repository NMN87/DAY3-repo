package Vezbanje_Sa_Kolegama;

import java.util.ArrayList;
import java.util.Arrays;

public class If_Statement {
    public static void main(String[] args) {
        /*
        A triangle is valid if the sum of all the three angles is equal to 180 degrees.
        Write a program that declares three integers as angles and check whether a triangle
        is valid or not.
        Note: MUST use if&else statement
         */


        int a = 60;
        int b = 100;
        int c = 20;
        int sum = 180;

        if (a+b+c==sum){
            System.out.println("Is valid");
        }else{
            System.out.println("Is not valid");
        }
        System.out.println("==================================================");

        /*
        write a program that can check if the two characters (chars) are same characters
            if same, print: “Same characters”
            otherwise, print: “Different characters”
         */

        char a1 = 'A';
        char b1 = 'B';

        if (a1==b1){
            System.out.println("Same characters");
        }else{
            System.out.println("Different characters");
        }
        System.out.println("=================================================");

        /*
        SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
        write a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false
         */

        int year =1999;

        if (year>=1995 && year <= 1998 || year >= 2001 && year<=2002 || year>=2004 && year<=2006 || year>=2015 &&
            year <=2017    ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println("===================================");

        /*
        write a program that can identify if the given character character is Alphabetic
            ex:
                character = ‘a’
            output:
                a is an Alphabetic
                character  = ‘!’
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
         */

        char ch1 = '!';
        if (ch1 >= 65 || ch1 <=90){
            System.out.println(ch1+" is alphabetic");
        }else{
            System.out.println(ch1+" is not alphabetic");
        }
        System.out.println("===========================================");

        /*
        write a program that can identify if the given character character is Digit
                ex:
                    character = ‘1’
                output:
                    1 is a Digit
                    character  = ‘!’
                output:
                    ! is not a digit
         */

          char ch2 = '1';
          if (ch2>=48 && ch2 <=57){
              System.out.println(ch2+" is digit");
          }else{
              System.out.println(ch2+" is not digit");
          }
        System.out.println("================================================");

          /*
          write a program that can identify if the given character is a symbol
                ex:
                    character = ‘!’
                output:
                    ! is a symbol
                    character  = ‘a’
                output:
                    a is not a symbol
           */

        char ch3 = '!';
        if (ch3>= 33 && ch3<=47){
            System.out.println(ch3+" is a symbol");
        }else{
            System.out.println(ch3+" is not a symbol");
        }
        System.out.println("==================================================");

        /*
        HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers).
        Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
        Some of the codes and their meanings area listed below:
	status code:
		200, OK
		201, Created
		202, Accepted
		301, Moved Permanently
		303, See Other
		304, Not Modified
		307, Temporary Redirect
		400, Bad Request
		401, Unauthorized
		403, Forbidden
		404, Not Found
		410, Gone
		500, Internal Server Error
		503, Service Unavailable
         */

        int a3 = 504;


        switch (a3){
            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            case 303:
                System.out.println("See Other");
                break;
            case 304:
                System.out.println("Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            case 503:
                System.out.println("Service Unavailable");
                break;
            default:
                System.out.println("Invalid input");
        }

        System.out.println("================================================");

        /*
        write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 	ex:
	 		month = 3
		output:
			31 days
			month = 4
		output:
			30 days
			month = 13
		output:
			Invalid month

		HINT:
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12
         */

/*
        int month = 1;
        int days = 0;


        if (month>=1 && month<=12 ){
            if (month== 2){
                days = 28;

            }else if (month==4 || month==5|| month==9||month==11){
                days = 30;
            }else{
                days=31;
            }
            System.out.println(days);

        }else{
            System.out.println("invalid input");
        }
*/
/*
        int month = 13;
        //int days = 0;

        int day = (month<=1 && month>=12)? (month==2) ? 28 :(month==4 || month==5|| month==9||month==11)? 30 :31:0;
        System.out.println(day);
*/
        System.out.println("====================================");

        int feb = 2;
        int month = 2;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.addAll(Arrays.asList(1,3,5,7,8,10,12));
        list1.addAll(Arrays.asList(4,6,9,11));

        if (month==feb){
            System.out.println(28);
        }else if(list.contains(month)){
            System.out.println(30);
        }else if (list1.contains(month)){
            System.out.println(31);
        }else{
            System.out.println("Invalid");
        }


        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list2 = new ArrayList<>();
/*
        for (int each: arr){
            list2.add(each);

        }
  */
        list2.add(arr[arr.length-1]);
        System.out.println(list2);








    }
}
