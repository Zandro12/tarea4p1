/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class ejercicios {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option;

            do {
                System.out.println("Menu:");
                System.out.println("1. Par e Impar con Listas");
                System.out.println("2. Par e Impar con Diccionarios");
                System.out.println("3. Generar matriz de temperaturas");
                System.out.println("4. Salir");
                System.out.print("Ingrese una opcion: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> parImparListas();
                    case 2 -> parImparDiccionarios();
                    //case 3 -> ();
                    case 4 -> System.out.println("Adios!");
                    default -> System.out.println("Opcion invalida. Intente nuevamente.");
                }
            } while (option != 4);
        }
    }

    
    public static void parImparListas() {
      
        java.util.List<Integer> lista = new java.util.ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add((int) (Math.random() * 100));
        }
        System.out.println("Lista original: " + lista);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                lista.set(i, -1); // dolar ($)
            } else {
                lista.set(i, -2); // numeral (#)
            }
        }
        System.out.println("Lista modificada: " + lista);
    }

    public static void parImparDiccionarios() {

        java.util.HashMap<Integer, String> diccionario = new java.util.HashMap<>();
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100);
            diccionario.put(numero, numero % 2 == 0 ? "$" : "#");
        }
        System.out.println("Diccionario original: " + diccionario);

        for (java.util.Map.Entry<Integer, String> entry : diccionario.entrySet()) {
            System.out.print(entry.getKey() + " -> " + entry.getValue() + " ");
        }
        System.out.println();
    }

    public static void main() {
        main();
    }
}
  