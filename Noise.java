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
