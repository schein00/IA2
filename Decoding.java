import java.util.*;

public class Decoding{

	public ArrayList<Integer> Viterbi(ArrayList<Integer> b){
			ArrayList<Integer> bit = new ArrayList<Integer>();
			ArrayList<Integer> erro = new ArrayList<Integer>();

			

			int j = 0, k = 0,ii = 0;

			for(int i = 0; i < (b.size() - 1); i = i + 2){
				j = b.get(i);
				k = b.get(i + 1);
				System.out.println("Estado "+ ii +": "+j + " " + k);
				ii++;
			}








			return bit;
	}




}
