public class CodeSegments {
    public static void main(String[] args) {
        int x = 2;
        int y = x++; // it will be 3 in the next calculating
        System.out.println(y);


        int a= 2;
        System.out.println(a++);

        int b = 8;
        int c = b--;
        System.out.println(c);

        int z = 1;
        z= -z-- + z++ / -z-- * --z;
        // -1-- + 0++ / -1-- * --0
        // -1 / 0
        System.out.println(z);





    }
}
