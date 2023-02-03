package org.example;

public class Main {

    public static void main(String[] args) {
        // para usar una clase, cree un objeto.
        // tipo de dato= variable. es poder acceder a sus atribulos y metodos.
        Empleado objeto = new Empleado();

        // utilizar el objeto para acceder a un atributo.
        objeto.nombre = "girasol";

        // utlizar el objeto para acceder al metodo.
        // llamando, las llaves se ponen en las clase.
        String resultado = objeto.saludar("linda");
        // punto 2.
        int sumartoria = objeto.sumar(5, 3);

        // salidas por consola.
        // acceder a mostrar el valor de un atributo.
        System.out.println(objeto.nombre);

        // acceder a mostrar el valor de un metodo.
        System.out.println(objeto.saludar("linde, mira ese chocorramito que destape y ese caramelito cual es."));
        System.out.println(resultado);
        System.out.println(sumartoria);

    }
}
