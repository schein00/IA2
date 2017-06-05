/*
*	Trabalho I de IA
*	
*	Jeferson A. Schein e Ivair Puerari
*
*	Classe onde e feita a adicao de ruido nos bit que sera enviados pela rede
*	sorteaia um numero aleatorio entre 0 - 99, se ele estiver abaixo do numero informado na entrada programa o bit sofrera ruido 
*	senao ele continuara como esta
*/

import java.util.*;

public class Noise{

	public ArrayList<Integer> AddNoise(ArrayList<Integer> b, int p){
		int j = 2;
		ArrayList<Integer> bb = new ArrayList<Integer>();

		Random radom  = new Random();
		int a = 0;

		for(int i = 0; i < b.size(); i++){
			j = b.get(i);
			a = radom.nextInt(100);
			if(a <= p){
				if (j == 0) {
					bb.add(1);
				}else {
					bb.add(0);
				}
			}else{
				bb.add(j);
			}
		}
		return bb;
	}


}
