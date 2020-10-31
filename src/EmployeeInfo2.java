public class EmployeeInfo2 {
    public static void main(String[] args) {
        String firstName = "Milos";
        String lastName = "Nikolic";
        String gender = "Male";
        int age = 32;
        String companyName = "Cybertek";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMArried = true;
        double salary = 150_000_35;
        String fullName = firstName+" "+lastName;

        System.out.println("Employee full name is: "+fullName);
        System.out.println(fullName+"' gender is: "+ gender);
        System.out.println(fullName+"' age is: "+age);
        System.out.println(fullName+" works at: "+companyName);
        System.out.println(fullName+"' job title is: "+jobTitle);
        System.out.println(fullName+"' salary is "+salary);
        System.out.println(fullName+" is full time employee: "+isFullTime);
        System.out.println(fullName+" is married: "+isMArried);


    }
}
