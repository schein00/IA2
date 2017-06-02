/*codificador*/

import java.util.Scanner;
import java.io.*;

public class cod {
	public static void main (String[] args) throws FileNotFoundException{
		
		maq maquina = new maq();
		try{
			Scanner scanner = new Scanner(new FileReader(args[0])).useDelimiter("\\n");
			int i = 0; 
			String linhas[];
			linhas  = new String[10];
			
			while(scanner.hasNext()){
				linhas[i] = Integer.parseInt(scanner.nextLine());
				i++;
			}
			
			int length = linhas[0].length();
 			System.out.println(linhas[0]);

			int h =0;
 			for (i = 0 ; i < length;i++ ) {
 				
 				h = (int)linhas[0].charAt(i);
 				System.out.println(h);

 				h = maquina.estados(h);
 				System.out.println(h);
 			}

		
		}
		catch (FileNotFoundException ex){
			System.out.println("- erro - " + args[0]);
		}
			
	}

}