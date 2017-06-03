import java.util.ArrayList;
import java.util.Arrays;
public class Codification{
    ArrayList<Integer> bits = new ArrayList<Integer>();
  	Machine maq;
    String state = "00";
    public ArrayList<Integer> Code(String L){
    		char c = '0';
        int par [] = new int[2];
    		maq = new Machine();
    	  	
        
    		for (int i = 0; i < L.length()+ 2; i++ ) {
    			if( i < L.length()){
    				c = L.charAt(i);
    				//state = machine.estados(state,c);
    			} 
                par = maq.emitePar(state,c);	
                for (int a : par ) {
    			//	 System.out.println("for 2");
    				 bits.add(a);
    			}
                if( i < L.length()){
    				//c = L[0].charAt(i);
    				state = maq.estados(state,c);
    			}
    		
                System.out.println("\ni: " +i);
    			System.out.println("\nbits\n" +  Arrays.toString( bits.toArray() ));
    		}
    //	}
        return bits;
    }
}
