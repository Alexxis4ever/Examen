import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Ejercicio1 ej1 = new Ejercicio1();
		Ejercicio2 ej2 = new Ejercicio2();
		Ejercicio3 ej3 = new Ejercicio3();
		
		
		String menu="MENU OPCIONES\n";
		menu+="1. Punto 1\n";
		menu+="2. Punto 2\n";
		menu+="3. Punto 3\n";
		menu+="4. Salir\n";
		menu+="Que ejercicio, desea recorrer?";

		
		int cod =0;
		
		do {
			
			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (cod) {
			case 1:
				ej1.inicio();
				break;
			case 2:
				ej2.inicio();
				break;
			case 3:
				ej3.inicio();
				break;
			case 4:
				break;
			default: System.out.println("El codigo no existe");
				break;
			}
		
			
		} while (cod!=4);

	}



}
