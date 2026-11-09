package org.example;

import org.example.upiiz.ipn.Circulo;
import org.example.upiiz.ipn.FiguraGeometrica;
import org.example.upiiz.ipn.Rectangulo;
import org.example.upiiz.ipn.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        https://github.com/carloscastanon035-art/EJE_FCCE_16.git
        System.out.println("=== SISTEMA DE FIGURAS GEOMÉTRICAS ===\n");

        List<FiguraGeometrica> figuras = new ArrayList<>();

        try {
            // 1. Crear los objetos
            FiguraGeometrica circulo = new Circulo(5.0);
            FiguraGeometrica rectangulo = new Rectangulo(4.0, 6.0);
            FiguraGeometrica triangulo = new Triangulo(3.0, 4.0, 5.0);

            // 2. Almacenarlos en la colección
            figuras.add(circulo);
            figuras.add(rectangulo);
            figuras.add(triangulo);

            // 3. Recorrer la colección e invocar métodos mediante polimorfismo
            for (FiguraGeometrica figura : figuras) {
                figura.mostrarInformacion();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear figura: " + e.getMessage());
        }
    }
}