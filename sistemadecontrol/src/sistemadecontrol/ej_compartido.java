package sistemadecontrol;

import java.util.Scanner;

public class ej_compartido {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//el area del triangulo
		System.out.println("Introduce la altura del triangulo: ");
		int altura = entrada.nextInt();
		System.out.println("Introduce la base del triangulo : ");
		int base = entrada.nextInt();
		System.out.println("el area del triangulo es : "+calcularArea(base,altura));
		
		//área y perímetro del círculo
		int radio = entrada.nextInt();
		System.out.println("el area de la circunferencia es: "+calaACirc(radio));
		System.out.println("el perimetro de la circunferencia es : "+perimetroACirc(radio));
		
		//calcular area del cilindro
		System.out.println("Introduce la altura para el cilindro: ");
		int alturaCil = entrada.nextInt();
		System.out.println("Introduce la radio para el cilindro: ");
		int radioCil = entrada.nextInt();
		System.out.println("El área del cilindro es: " + areaCilindro(alturaCil, radioCil));
		
		
    }public static double calcularArea(int base, int altura) {
	return base * altura / 2;

	//Alumno 2 calcula el área y el perímetro del círculo
    }public static double calaACirc(int radio) {
		double area = 3.14*(radio^2);
		return area;
	}public static double perimetroACirc(int radio) {
		double perimetro=2*(3.14*radio);
		return perimetro;
	}
	//el area del cilindro
	public static double areaCilindro(int alturaCil, int radioCil) {
		return 2*3.14* alturaCil + 2*3.14* radioCil;
	}
}
