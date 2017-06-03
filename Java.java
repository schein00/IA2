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
        ArrayList<Integer> bits = new ArrayList<Integer>();    
        int p = 0;

        try{

			System.out.println(args[0]);
            bits = cod.Code(args[0]);
            
    		System.out.println("Main\n");
            System.out.println("\nbits\n" +  Arrays.toString( bits.toArray() ));

            if(args[1] != null){          
            	p = Integer.parseInt(args[1]);
            	System.out.println("porcentagem " + p);
            }

            bits = noi.AddNoise(bits, p);



        }catch(Exception e){
				System.out.println("Nao e possivel ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
				System.out.println("Uso:\n java -jar Fikken.jar  /caminho/para/arquivo.fik");
				return;		
		}
        
        
    }
}
