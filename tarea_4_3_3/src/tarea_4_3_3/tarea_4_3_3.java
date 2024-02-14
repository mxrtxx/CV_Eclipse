package tarea_4_3_3;

import java.util.Scanner;

public class tarea_4_3_3 {
		static public void main (String[]args){
	        Scanner Teclado=new Scanner(System.in);
	        int numero1=0, contador=0;
	        System.out.println("Dame un numero para saber su factorial");
	        numero1=Teclado.nextInt();
	        float resultado=0;
	        float multiplicador=1;
	        while (numero1>1){
	            resultado=multiplicador*numero1;
	            multiplicador=resultado;
	            numero1--;
	            System.out.println(resultado);
	        }
	    }
	System.out.println("Esta linea a sido añadida desde GitHub para la tarea 4_3_3 control de versiones en Eclipse");
	}

