import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio3 {



	public void inicio() {
		
		ArrayList<Integer> listaA = new ArrayList<Integer>();
		ArrayList<Integer> listaB = new ArrayList<Integer>();
		ArrayList<Integer> listaC = new ArrayList<Integer>();
		
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de las listas"));
		
		
		for (int i = 0; i < cantidad; i++) {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Lista A: Ingrese el numero: "+(i+1)));
			
			if (numero<0) {
				i--;
				System.out.println("No se permiten datos negativos");
			} else {
				listaA.add(numero);
			}
			
		}
		
		
		for (int i = 0; i < cantidad; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Lista B: Ingrese el numero: "+(i+1)));
			
			if (numero<0) {
				i--;
				System.out.println("No se permiten datos negativos");
			} else {
				listaB.add(numero);
			}
		}
		
		
		for (int i = 0; i < listaA.size(); i++) {
			
			listaC.add(listaA.get(i)*listaB.get(i));
			
		}
		
		System.out.println("Datos lista A: "+listaA);
		System.out.println("Datos lista B: "+listaB);
		
		System.out.println();
		
		System.out.println("El resultado de la multiplicacin de 2 listas es: "+listaC);
		
		System.out.println("-------------------------");
		
		
		
		
		
	}

}
