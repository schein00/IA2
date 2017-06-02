import java.util.Scanner;
import java.io.*;
public class maq {
	public static int state;


	public int estados(int ent){
		System.out.println(ent);
		switch (ent) {
			case 0:
				if (state == 00) {
					state = 00;	
							}	
				if (state == 01) {
					state = 00;			
							}
				if (state == 10) {
					state = 01;			
							}
				else{
					state = 01;
				}	

			case 1:
				if (state == 00) {
					state = 10;	
							}	
				if (state == 01) {
					state = 10;			
							}
				if (state == 10) {
					state = 11;			
							}
				else{
					state = 11;
				}	
		}
		return state;
	}
}
