public class Codification{

  	Machine maq;
    public void Code(String L[]){
    		char c;

    		maq = new Machine();
    	  	byte states;
    	  	int t = 00;
    	  	System.out.println(t); 
    		for (int i = 0; i < L[0].length(); i++ ) {
    				 
    			c = L[0].charAt(i);
    			states = maq.estados(c);

    			System.out.println("estado de saida :\n" + states);			
    			//System.out.println(c);
    		}
    //	}
    }
}
