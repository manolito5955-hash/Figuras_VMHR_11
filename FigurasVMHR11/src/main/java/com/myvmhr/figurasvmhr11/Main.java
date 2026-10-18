

package com.myvmhr.figurasvmhr11;

public class Main {

    public static void main(String[] args) {

        Figura2D f = new TrianguloRect(3, 4);
        System.out.println(f.imprimeFigura());

        System.out.println();

        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}
