public class Codification{

  	maq machine;
    public void Code(String L[]){
    		char c;

    		machine = new maq();
    	  	byte states;
    	  	int t = 00;
    	  	System.out.println(t); 
    		for (int i = 0; i < L[0].length(); i++ ) {
    				 
    			c = L[0].charAt(i);
    			states = machine.estados(c);

    			System.out.println("estado de saida :\n" + states);			
    			//System.out.println(c);
    		}
    //	}
    }
}
