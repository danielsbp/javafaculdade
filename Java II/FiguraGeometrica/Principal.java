import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        System.out.println("Digite um lado: ");
        Scanner sc = new Scanner(System.in);
        quadrado.setLado(sc.nextDouble());
        System.out.println("Área: " + quadrado.getArea());

        Triangulo triangulo = new Triangulo();

        System.out.println("Digite o lado A: ");
        triangulo.setLadoA(sc.nextDouble());

        System.out.println("Digite o lado B: ");
        triangulo.setLadoB(sc.nextDouble());

        System.out.println("Digite o lado C: ");
        triangulo.setLadoC(sc.nextDouble());

        System.out.println(triangulo.getNomeFigura());
        System.out.println(triangulo.getArea());
        System.out.println(triangulo.getPerimetro());

        sc.close();
    }
    
}
