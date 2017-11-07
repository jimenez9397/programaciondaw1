package ej6vectores;

public class ej6vectores {
	/*6. Generar una matriz de 10x10, asignarles número reales aleatorios a cada elemento entre -5 y 5.
	Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la
	matriz. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fila, columna;
		double sumaf, sumac;
		double matriz [][] = new double [10][10];
		
		// almacenamos los datos en el vector
		for (fila = 0; fila <10; fila ++){
			sumaf = 0;
			for (columna = 0; columna <10; columna ++){
				matriz [fila][columna] = Math.random()*11 -5; // se multiplica *11 para que el número llegue a 10, el math random solo va entre 0 y 1;
				System.out.printf("%5.0f", matriz [fila][columna] ); //se pone el porcentaje y la f al final para hacer que los literales sean reales con los decimales que querammos 
				sumaf = sumaf + matriz[fila][columna];
			}
			
			System.out.printf("%5.0f\n", sumaf);

		}
	
		for (columna = 0; columna <10; columna ++){
			sumac = 0;
			for (fila = 0; fila <10; fila ++){
				sumac = sumac + matriz[fila][columna];
			}
			
			System.out.printf("%5.0f", sumac);
		} //for
		//System.out.printf("   Suma columnas");
	} //main
} //class
