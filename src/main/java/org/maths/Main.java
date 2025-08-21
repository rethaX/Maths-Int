package org.maths;

public class Main {
    public static void main(String[] args) {

        //(a+=b)^2 = a^2 + 2ab + b^2

        int a = 25;
        float b = 42.159f;
        double value = a*a + 2*(a*b)+ b*b;

        System.out.print((float)value);

    }
}