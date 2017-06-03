import java.util.Scanner;
import java.io.*;
public class Machine {
	public String estados(String state, char bit){
		//System.out.println("estados");		
		

		if ( bit == '0') {
			//System.out.println("\nestado f "+state );
			if(state.equals("00")){ return state = "00"; }
			if(state.equals("01")){ return state = "00"; }
			if(state.equals("10")) {  return state = "01"; }		
			if(state.equals("11")){ return state = "01"; }	
		}
	
		if ( bit == '1') {
			//System.out.println("\nestado f \n"+state );

			if(state.equals("00")){ return state = "10"; }
			if(state.equals("01")){ return state = "10"; }
			if(state.equals("10")){ return state = "11"; }		
			if(state.equals("11")){ return state = "11"; }	
		}
		//System.out.println("\nRETORNO \n"+state );	
		return "erro";
	}
	public int [] emitePar(String st, char bit){
		//System.out.println("emite par");
		int par[] = new int[2];
		if ( bit == '0') {
			if(st.equals("00")){  
					par[0] = 0;
					par[1] = 0;
			 }
			if(st.equals("01")){ 
					par[0] = 1;
					par[1] = 1;
			 }
			if(st.equals("10")){ 
					par[0] = 1;
					par[1] = 0;
			 }
			if(st.equals("11")){ 
					par[0] = 0;
					par[1] = 1;
			 }		
		}

		if ( bit == '1') {
			if(st.equals("00")){  
					par[0] = 1;
					par[1] = 1;
			 }
			if(st.equals("01")){ 
					par[0] = 0;
					par[1] = 0;
			 }
			if(st.equals("10")){ 
					par[0] = 0;
					par[1] = 1;
			 }
			if(st.equals("11")){ 
					par[0] = 1;
					par[1] = 0;
			 }
		}
		return par;
	} 
}



