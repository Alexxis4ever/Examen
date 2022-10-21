import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio1 {


	public void inicio() {
		
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		
		int nNumeros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros quiere agregar?"));
		
		int suma=0;
		
		int positivos=0;
		int negativos=0;
		
		for (int i = 0; i < nNumeros; i++) {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
			Numeros.add(numero);
			
			suma =(suma)+numero;
			
			if (numero>0) {
				positivos++;
			} else {
				negativos++;
			}
			
		}
		
		int promedio = suma / nNumeros;
		
		System.out.println(Numeros);
		
		System.out.println("La suma de todos los numeros es: " + suma);
		System.out.println("El promedio de numeros es: " + promedio);
		System.out.println("Numeros positivos: " + positivos);
		System.out.println("Numeros negativos: " + negativos);
		
		System.out.println("-------------------------");
		
		
	}

	
	
}
