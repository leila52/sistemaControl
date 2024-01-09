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
		
		//área del rectángulo
		System.out.println("introduce el lado 1 del rectangulo");
		int lado1rec=entrada.nextInt();
		System.out.println("introduce el lado 2 del rectangulo");
		int lado2rec=entrada.nextInt();
		System.out.println("El área del rectángulo es: " + areaRectangulo(lado1rec, lado2rec));
<<<<<<< HEAD
		// calcular el volumen de un cubo
		System.out.println("introduce un lado del cubo");
		int ladocubo=entrada.nextInt();
		System.out.println("el volumen del cubo es: "+volumenCubo(ladocubo));
=======
		
		//área de un cubo
		System.out.println("Introduce el lado de un cubo: ");
		int ladoCubo = entrada.nextInt();
		System.out.println("El área de un cubo es: " + areaCubo(ladoCubo));
		
		
>>>>>>> branch 'master' of https://github.com/leila52/sistemaControl.git
    }public static double calcularArea(int base, int altura) {
	return base * altura / 2;

	//Alumno 2 calcula el área y el perímetro del círculo
    }public static double calaACirc(int radio) {
		double area = 3.14*(radio^2);
		return area;
	}public static double perimetroACirc(int radio) {
		double perimetro=2*(3.14*radio);
		return perimetro;
	
	}public static double areaRectangulo(int lado1rec,int lado2rec) {
		return ((lado1rec*2) + (lado2rec*2));
	}public static double areaCubo(int ladoCubo) {
		return (ladoCubo*ladoCubo);
	}
	public static double volumenCubo(int ladocubo) {
		double volumen=ladocubo*ladocubo*ladocubo;
		return volumen;
}
}
