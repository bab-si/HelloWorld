package de.example.helloWorld;

public class Operators {

    public static void main(String[] args) {

        // hands on first part
        int a1 = 4;
        int b1 = 2;
        int c1 = a1 + b1;
        System.out.println(c1);

        int a2 = 4;
        int b2 = 2;
        int c2 = a2 % b2;
        System.out.println(c2);

        int a3 = 14;
        int b3 = 3;
        int c3 = a3 % b3;
        System.out.println(c3);

        // hands on second part
        byte a = 4;
        byte b = 2;

        boolean c4 = a == b;
        System.out.println(c4);

        boolean c5 = a != b;
        System.out.println(c5);

        boolean c6 = a > b;
        System.out.println(c6);

        boolean c7 = a < b;
        System.out.println(c7);

        boolean c8 = a >= b;
        System.out.println(c8);

        boolean c9 = a <= b;
        System.out.println(c9);

        // hands on third part
        boolean y = true;
        boolean z = false;

        boolean c10 = y && z;
        System.out.println(c10);

        boolean c11 = y || z;
        System.out.println(c11);

        boolean c12 = y!= z;
        System.out.println(c12);

        // hands on fourth part
        byte c13 = a += b;
        System.out.println(c13);

        byte c14 = a -= b;
        System.out.println(c14);

        byte c15 = a *= b;
        System.out.println(c15);

        byte c16 = a /= b;
        System.out.println(c16);

        byte c17 = a %= b;
        System.out.println(c17);

        byte c18 = a &= b;
        System.out.println(c18);

        byte c19 = a |= b;
        System.out.println(c19);

        byte c20 = a <<= b;
        System.out.println(c20);

        byte c21 = a >>= b;
        System.out.println(c21);

        byte c22 = a >>>= b;
        System.out.println(c22);
    }

}
