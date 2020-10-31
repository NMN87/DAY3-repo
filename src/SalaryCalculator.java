import com.sun.corba.se.impl.encoding.CDROutputObject;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;


    /*write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
                ex:
                    if: rate = 55;
                        stateTaxRate = 0.04;
                        federalTaxRate =0.22;
                        weeklyHours = 40;
                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD
                Assume that a year has 48 weeks (excluding PTO)
*/
     //kvantna fizika!!!
/*
        int rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;
        int salary = 105600;
        int totalTax = 27456;



        System.out.println("=======================");

        int num1 = 46;
        int num2 = 90;
        System.out.println(num1 + num2);
*/
public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
        double tax = 0.28;

        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;

        System.out.println(totalTax);
        System.out.println(salaryAfterTax);





    }
    }

