package Start;

import java.util.Scanner;

import figuritas.Circulo;
import figuritas.Cuadrado;
import figuritas.Cubo;
import figuritas.Rectangulo;
import figuritas.Triangulo;
import figuritas.figurita;

public class init {
	
	
	private static StringBuffer bf;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		 bf = new StringBuffer();
		while(true)
		{
			bf.append("Seleccione una figura:\n")
												.append("[1]\tCirculo\n")
												.append("[2]\tRectagulo\n")
												.append("[3]\tCuadrado\n")
												.append("[4]\tTriangulo\n")
												.append("[5]\tCubo\n\n");
			
			System.out.println(bf.toString());
			bf.setLength(0);
			
			String opc = in.nextLine();
			
			if(!opc.matches("[0-9]"))
			{
				System.err.println("NO ES UN NUMERO TU OPCION ELIGE NUEVAMENTE.");
				continue;
			}
			
			switch (opc) {
			case "1":
			{
				System.out.println("Ingrese radio:\n");
				double choose = Double.valueOf(in.nextLine());
				Circulo obj = new Circulo(choose);
				eleccion(obj, in);
				
			}
				break;
			case "2":
			{
				System.out.println("Ingrese base:\n");
				double base = Double.valueOf(in.nextLine());
				System.out.println("Ingrese altura:\n");
				double altura = Double.valueOf(in.nextLine());
				Rectangulo obj = new Rectangulo(base, altura);
				eleccion(obj, in);
				
			}
				break;
			case "3":
			{
				System.out.println("ingrese tamaño de los lados:\n");
				double lado = Double.valueOf(in.nextLine());
				Cuadrado obj = new Cuadrado(lado);
				eleccion(obj, in);
				
			}
				break;
			case "4":
			{
				System.out.println("Ingrese base:\n");
				double base = Double.valueOf(in.nextLine());
				System.out.println("Ingrese altura:");
				double altura = Double.valueOf(in.nextLine());
				Triangulo obj = new Triangulo(base, altura);
				eleccion(obj, in);
			}
				break;
			case "5":
			{
				System.out.println("ingrese tamaño de los lados:\n");
				double lado = Double.valueOf(in.nextLine());
				Cubo obj = new Cubo(lado);
				eleccion(obj, in);
			}
				break;
			default:
				break;
			}
		}
		
		
	}
	public static void eleccion(figurita obj, Scanner in)
	{
		while(true)
		{
			System.out.println("¿Que operacion desea realizar? A(area) / P(perimetro)");
			String op = in.nextLine();
			if(op.equalsIgnoreCase("a"))
			{
				System.out.println("El area es: "+obj.area());
				return;
			}
			else if(op.equalsIgnoreCase("p"))
			{
				System.out.println("El perimetro es: "+obj.perimetro());
				return;
			}
			else
			{
				System.err.println("NO ES UNA OPCION INTENTALO DE NUEVO.");
				continue;
			}
		}
	}

}
