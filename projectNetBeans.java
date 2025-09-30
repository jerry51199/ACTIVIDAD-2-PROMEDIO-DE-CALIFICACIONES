
package com.mycompany.mavenproject8;


public class Mavenproject8 {

    // Atributos
    private String nombre;
    private int[] calificaciones = new int[5]; // arreglo de 5 calificaciones

    // Constructor
    public Mavenproject8(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método 1: Calcular promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int cal : calificaciones) {
            suma += cal;
        }
        return suma / 5.0;
    }

    // Método 2: Obtener calificación final según promedio
    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) return 'F';
        else if (promedio <= 60) return 'E';
        else if (promedio <= 70) return 'D';
        else if (promedio <= 80) return 'C';
        else if (promedio <= 90) return 'B';
        else return 'A';
    }

    // Método 3: Imprimir resultados
    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calFinal = obtenerCalificacion(promedio);

        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + calFinal);
    }

    // Método principal de prueba
    public static void main(String[] args) {
        int[] califs = {85, 90, 78, 92, 88}; // ejemplo de calificaciones
        Mavenproject8 p = new Mavenproject8("Gerardo Sanchez", califs);
        p.imprimirResultados();
    }
}
       
       
      
