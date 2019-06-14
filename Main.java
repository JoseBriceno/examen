package com.briceno;

public class Main {

    public static void main(String[] args) {
        Producto shampoo = new Producto(55,"cabello",120,true);
        Producto cepillo = new Producto(13,"cabello",150,false);
        Producto gelatina = new Producto(98,"cabello",130,true);

        System.out.println("IMP=" +shampoo.calcularImpuesto());
        System.out.println("IMP=" +cepillo.calcularImpuesto());
        System.out.println("IMP=" +gelatina.calcularImpuesto());
    }
}
