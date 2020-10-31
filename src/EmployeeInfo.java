public class EmployeeInfo {
    public static void main(String[] args) {




       /*  Warmup tasks:
        1. create a class named EmployeeInfo
                declare the following variables:

        firstName
        lastName
        gender
        age
        companyName
        jobTitle
        isFullTime
        isMarried
        salary
        write a program that can display the full info of the employee
   ex:
        firstName = John
        lastName = Daniel
        gender = Male
        age = 35
        companyName = CapitalOne
        jobTitle = SDET
        isFullTime = true
        isMarried = false
        salary = 120000.50
    output:
        Employee' full name is: John Daniel
        John Daniel' gender is: Male
        John Daniel' age is: 35 years old
        John Daniel works at: CapitalOne
        John Daniel' Job title is: SDET
        John Daniel' salary is 120000.5 $
        John Daniel is full time employee: true
        John Daniel is married: false
          */
        String fullName = "Milos Nikolic";
        String gender = "Male";
        String age = "35 years old";
        String companyName = "DMW Protection";
        String jobTitle = "Security officer";
        double salary = 100000.5;
        boolean isFullTime = false;
        boolean isMarried = true;


        System.out.println("Employee' full name is: "+fullName);
        System.out.println(fullName+"'"+ " gender is: "+gender);
        System.out.println(fullName+"'"+ " age is: "+age);
        System.out.println(fullName+"'"+ " works at: "+companyName);
        System.out.println(fullName+"'"+ " Job title is: "+jobTitle);
        System.out.println(fullName+"'"+ " salary is: "+"$"+salary);
        System.out.println(fullName+" is full time employee: "+isFullTime);
        System.out.println(fullName+" is married: "+isMarried);

















    }
}
