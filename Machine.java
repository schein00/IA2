import java.util.Scanner;
import java.io.*;
public class Machine {
	public static byte state = 00;


	public byte estados(char bit){
		System.out.println("Estado " + state);
		System.out.println("bit de entrada \n" + bit);			
	

		if ( bit == '0') {
			if(state == 00){ state = 00; }
			if(state == 01){ state = 00; }
			if(state == 10){ state = 01; }		
			if(state == 11){ state = 01; }	
		}

		if ( bit == '1') {
			if(state == 00){ state = 10; }
			if(state == 01){ state = 10; }
			if(state == 10){ state = 11; }		
			if(state == 11){ state = 11; }	
		}
		return state;
	}
}
