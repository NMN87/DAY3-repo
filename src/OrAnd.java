public class OrAnd {
    public static void main(String[] args) {
        int applesCount = 20;
        int orangesCount = 30;
        int pearsCount = 30;
        boolean comp = applesCount < orangesCount || orangesCount >= pearsCount;
        //                      true              ||         true
        //                                = true

        System.out.println(comp);


        double degree = 70;
        String outsideWeather = "Shinny";
        boolean comp1 = (!(outsideWeather=="Rainy" || degree ==70));


        System.out.println(comp1);

        int b =2;
        boolean result = ++b == 2 || --b == 2 && --b == 2;
        //               3   == 2 ||  2  == 2 &&  1 == 2
        //                 false  ||  true    &&  false
        //                 false  ||       false
        //                   = false
        System.out.println(result);

        boolean x = true, z = true;
        int y = 20;
        x = (y!=10) || (z= false);
        //   false  || true
        //    true

        System.out.println(x);

        double num1 = 20;
        double num2 = 80;
        double result1 = (num1 + num2)*25;

        System.out.println(result1);





    }
}
