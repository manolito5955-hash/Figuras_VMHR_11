
package com.myvmhr.figurasvmhr11;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        return (alto * ancho) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(alto * alto + ancho * ancho);
        return alto + ancho + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura()
                + "\nSe imprime un Triangulo con alto: " + alto
                + ", ancho: " + ancho
                + ", area: " + String.format("%.2f", calcularArea())
                + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}