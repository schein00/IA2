/*
*	Trabalho I de IA
*	
*	Jeferson A. Schein e Ivair Puerari
*
*	
*
*
*/

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Java{
    public static void main (String[] args) throws FileNotFoundException{
	    Codification cod = new Codification();
		Noise noi = new Noise();
		Decoding decod = new Decoding();	
        ArrayList<Integer> bits = new ArrayList<Integer>();    		// bits de entrada
        ArrayList<Integer> bitse = new ArrayList<Integer>();		// bits emitidos 
        ArrayList<Integer> bitsn = new ArrayList<Integer>();		// bits emitidos com ruido
		ArrayList<Integer> bitsp = new ArrayList<Integer>();		// bits decodificados

        try{
        	 int p = 0;
        	char z = '0';
			System.out.println(args[0]);
            bitse = cod.Code(args[0]);
            for ( int s = 0; s < args[0].length() ; s++ ) {
            	z = args[0].charAt(s);
            	if(z == '0'){
       		     	bits.add(0);
            	}else{
            		bits.add(1);
            	}
            }
    		
            if(args[1] != null){          
            	p = Integer.parseInt(args[1]);
            	System.out.println("Probabilidade de Ruido Acontecer em cada bit: " + p +"%");
            }

            bitsn = noi.AddNoise(bitse, p);	
            bitsp = decod.Viterbi(bitsn);

            System.out.println("\nBits de Entrada\n" +  Arrays.toString( bits.toArray() ));
            System.out.println("\nBits Emitidos\n" +  Arrays.toString( bitse.toArray() ));	
			System.out.println("\nBits Emitidos com Ruido\n" +  Arrays.toString( bitsn.toArray() ));	
            System.out.println("\nBits Decodificados\n" +  Arrays.toString( bitsp.toArray() ));	


            //Comparsion
            int qerro = 0;
            for (int i = 0; i < bits.size() ; i++) {
            	if (bits.get(i) != bitsp.get(i)) {
            		qerro = qerro + 1; 
            	}
            }

            System.out.println("Quantia de bits de entrada: " + bits.size());
            System.out.println("Quantia de bit Decodificados corretamente:  " + (bits.size() - qerro));
            System.out.println("Quantia de bits de Decodificados errados: " + qerro);
            
            System.out.println("\n\n\n");

        }catch(Exception e){
				System.out.println("Nao e possivel ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
				System.out.println("Uso:\n java -jar Fikken.jar  /caminho/para/arquivo.fik");
				return;		
		}
        
        
    }
}
