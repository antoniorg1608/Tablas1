package es.studium.Tablas1;

import java.util.Scanner;

public class Tablas1
{

	public static void main(String[] args)
	{
		final int TAM = 5;
		int tabla[] = new int[TAM];
		int i;
		Scanner teclado = new Scanner(System.in);
		// Recorrido para rellenar la tabla
		for (i = 0; i < TAM; i++)
		{
			System.out.println("Ingrese el valor de la posici�n " + i + ":");
			tabla[i] = teclado.nextInt();
		}
		// Recorrido para mostrar los valores de la tabla
		for (i = 0; i < TAM; i++)
		{
			System.out.println("Tabla[" + i + "]=" + tabla[i]);
		}
		teclado.close();
	}

}
