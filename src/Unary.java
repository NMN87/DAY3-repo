public class Unary {
    public static void main(String[] args) {
        int a = 50;
        a = -a-- +a++ / -a-- * --a;
        //  -50 +49 / -50 * 49

        System.out.println(a);

        int b = 50;
        b = --b + b++ + b-- + b++;
        // 49 + 49 + 50 + 49
        // = 197

        System.out.println(b);

        int x = 4;
        int y = x * 4 - x++;
        //      4 * 4 - 4
        //        16  - 4 = 12


        System.out.println(y);





    }
}
