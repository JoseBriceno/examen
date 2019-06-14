package com.briceno;

public class Producto {
    public int codigo;
    public String descripcion;
    public double precio;
    public boolean gravado;
    public double resultado;

    public Producto(int codigo, String descripcion, double precio, boolean gravado){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gravado = gravado;

    }
    public double calcularImpuesto (){
        if (gravado == true){
            resultado=precio*0.15;
            return resultado;
        }
        return 0;
    }

}