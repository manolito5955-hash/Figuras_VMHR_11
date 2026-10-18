
package com.myvmhr.figurasvmhr11;


public abstract class FiguraRecta extends Figura2D {

    protected int ancho;
    protected int alto;

    public FiguraRecta(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
}
