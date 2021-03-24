package ejercicio2;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(2);
        System.out.println(circulo.toString());

        Triangulo triangulo = new Triangulo(10, 15);
        System.out.println(triangulo.toString());

        Rectangulo rectangulo = new Rectangulo(10, 5);
        System.out.println(rectangulo.toString());

        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Circulo(2);
        figuras[1] = new Rectangulo(10, 15);
        figuras[2] = new Triangulo(10, 5);

        double resultado = FiguraUtil.areaPromedio(figuras);
        System.out.println("El area promedio es: " + resultado);
    }
}
