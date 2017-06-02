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

public class Java{
    public static void main (String[] args) throws FileNotFoundException{
        File arquivo;
		Scanner conteudo;
	    Codification cod = new Codification();
		String linhas[];
    
        
        try{
            arquivo = new File(args[0]);
			conteudo = new Scanner(arquivo);
            
            long tamanhoArquivo = arquivo.length();
		    FileInputStream fs = new FileInputStream(arquivo);
	        DataInputStream in = new DataInputStream(fs);

	        LineNumberReader lineRead = new LineNumberReader(new InputStreamReader(in));
		    lineRead.skip(tamanhoArquivo);
            
            linhas  = new String[count];
			
			while(conteudo.hasNext()){
				linhas[i] = conteudo.nextLine();
				i++;
			}

            cod.Code(linhas);
            
            
        }catch(Exception e){
				System.out.println("Nao e possivel ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
				System.out.println("Uso:\n java -jar Fikken.jar  /caminho/para/arquivo.fik");
				return;		
		}
        
        
    }
}
