package org.example.upiiz.ipn;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor a 0.");
        }
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Figura: Círculo");
        System.out.println("Radio: " + radio);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Perímetro: %.2f\n\n", calcularPerimetro());
    }
}