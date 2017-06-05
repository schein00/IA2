/*
*	Trabalho I de IA
*	
*	Jeferson A. Schein e Ivair Puerari
*
*	Codificador e Decodigicador de bits, utilizando Viterbi
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
		String entrada0 = "", entrada1 = "", entrada2 = "", entrada3 = "", entrada4 = "", entrada5 = "";
		String entrada = "";
		int porcentagem = 0, en = 0, ez = 0; 
		Scanner scanner = new Scanner(System.in);

        try{

        	while(true){
				
        		if (entrada.equals("2")) {
        			return;
        		}
				
        		if(ez != 0){
	        		entrada0 = scanner.nextLine();
     			}

         		System.out.println("Para finalizar o programa digite 2");	
	       		System.out.print("Digite os bits de entrada: ");
        		entrada = scanner.nextLine();
           		if (entrada.equals("2")) {
        			return;
        		}
        		System.out.print("Digite a porcentagem de cada bit sofrer ruido: ");
        		porcentagem = scanner.nextInt();

        		
        		System.out.println("entrada: "+ entrada);
        		
        		System.out.println("porcentagem: " + porcentagem);
        		
	        	char z = '0';
				System.out.println(entrada);
	            bitse = cod.Code(entrada);

	            for( int s = 0; s < entrada.length() ; s++ ){
	            	z = entrada.charAt(s);
	            	if(z == '0'){
	       		     	bits.add(0);
	            	}else{
	            		bits.add(1);
	            	}
	            }
	    		
//	            if(args[1] != null){          
//	            	p = Integer.parseInt(args[1]);
//	            	System.out.println("Probabilidade de Ruido Acontecer em cada bit: " + p +"%");
//	            }

	            bitsn = noi.AddNoise(bitse, porcentagem);	
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
	            
	            cod = new Codification();
	            System.out.println("\n\n\n");
				entrada = new String();
				bits = new ArrayList<Integer>();
				bitse = new ArrayList<Integer>();		// bits emitidos 
        		bitsn = new ArrayList<Integer>();		// bits emitidos com ruido
				bitsp = new ArrayList<Integer>();
				ez++;
			}
        }catch(Exception e){
				System.out.println("Nao e possivel ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
				System.out.println("Uso:\n java -jar Fikken.jar  /caminho/para/arquivo.fik");
				return;		
		}
        
        
    }
}
