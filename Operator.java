public class Operator {
    public static void main(String[] args) {
        /*
            jenis jenis operator
            +   addition            x + y
            -   substraction        x - y
            *   multiplication      x * y
            /   division            x / y
            %   modulus             x % y
            ++  increment           x++
            --  decrement           x--

            =
            +=  
            -=
            *=
            /=
            %=
            &=
            !=
            ^=
            >>=
            <<=

            ==
            !=
            >
            <
            >=
            <=

            &&
            ||
            !
         */

        Integer x = 10;
        Integer y = 5;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(++x);
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x+= 5);
        System.out.println(x-= 5);
        System.out.println(x*= 5);
        System.out.println(x/= 5);
        System.out.println(x%= 5);
        System.out.println(x&= 5);
        System.out.println(x!= 5);
        System.out.println(x^= 5);
        System.out.println(x>>= 5);
        System.out.println(x<<= 5);
        System.out.println(x== 5);
        System.out.println(x!= 5);
        System.out.println(x> 5);
        System.out.println(x< 5);
        System.out.println(x<= 5);
        System.out.println(x>= 5);

        // boolean hasil = x && y; //error
        boolean nilai1 = true;
        boolean nilai2 = false;
        boolean hasil1 = nilai1 && nilai2;
        System.out.println(hasil1);
        boolean hasil2 = nilai1 || nilai2;
        System.out.println(hasil2);
        boolean hasil3 = nilai1 | nilai2;
        System.out.println(hasil3);

    }
}
