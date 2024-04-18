package calcularIMC;

import java.util.Scanner;

//import org.junit.jupiter.api.Test;

public class Main {
	public static void main(String[] args) {
	 persona persona =new persona();
	 Scanner input= new Scanner(System.in);
	 System.out.println("Ingrese el peso de la persona");
	 persona.setPeso(input.nextFloat());
	 System.out.println("Ingrese la estatura de la persona");
	 persona.setEstatura(input.nextFloat());
	 
	 System.out.print("IMC de personas es :"+persona.calcular());
	
	 input.close();
	}
	
	// @Test
	// void addition() {
	//     assertEquals(2, 1 + 1);
	// }
}
