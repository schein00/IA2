import java.util.*;

public class Decoding{

	public ArrayList<Integer> Viterbi(ArrayList<Integer> b){
			ArrayList<Integer> bit = new ArrayList<Integer>();
			ArrayList<Integer> bits = new ArrayList<Integer>();
			
			
			int e00 = 0;
			int e01 = 0;
			int e10 = 0;
			int e11 = 0;  

			Random radom  = new Random();
			int a = 0;

			int j = 0, k = 0,ii = 0, aux1 = 0, aux2 = 0, aux3 = 0, aux4 = 0, aux5 = 0, aux6 = 0;


			// Caso 1

			j = b.get(0);
			k = b.get(1);

			if(j == 0 && k == 0){
				e00 = 0;
				e10 = 2;
				bit.add(0);
			}else if(j == 0 && k == 1 ||  j == 1 && k == 0){
					a = radom.nextInt(100);
					if((a % 2) == 0){
						bit.add(0);
					}else{
						bit.add(1);
					}
					e00 = 1;
					e10 = 1;
			}else if(j == 1 && k == 1){
				e00 = 2;
				e10 = 0;
				bit.add(1);
			}

			j = b.get(2);
			k = b.get(3);

			//caso 2
			if(j == 0 && k == 0){
				e11 = e10 + 1;
				e01 = e10 + 1;
 				e10 = e00 + 2;
 				e00 = e00 + 0;
 			}else if (j == 0 && k == 1) {
				e11 = e10 + 0;
				e01 = e10 + 2;
 				e10 = e00 + 1;
 				e00 = e00 + 1;
 			}else if (j == 1 && k == 0) {
				e11 = e10 + 2;
				e01 = e10 + 0;
 				e10 = e00 + 1;
 				e00 = e00 + 1;
 			}else if (j == 1 && k == 1) {
				e11 = e10 + 1;
				e01 = e10 + 1;
 				e10 = e00 + 0;
 				e00 = e00 + 2;
			}

			if(e00 <= e01 && e00 <= e10 &&e00 <= e11){
 				bit.add(0);
 			}else if (e01 <= e00 && e01 <= e10 &&e01 <= e11) {
 				bit.add(0);
 			}else if (e10 <= e00 && e10 <= e01 &&e10 <= e11) {
 				bit.add(1);
 			}else{
 				bit.add(1);
 			}

 			//caso geral
			for(int i = 4; i < (b.size() - 2); i = i + 2){
				j = b.get(i);
				k = b.get(i + 1);


				if(j == 0 && k == 0){
					//01
					aux1 = e10 - 1;
					aux2 = e11 - 1;
					if(aux1 <= aux2){
						aux4 = aux1;
					}else if (aux2 < aux1) {
						aux4 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux4 = aux1;
						}else{
							aux4 = aux2;
						}	
					}
					//11
					aux1 = e10 - 1;
					aux2 = e11 - 1;
					if(aux1 <= aux2){
						aux3 = aux1;
					}else if (aux2 < aux1) {
						aux3 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux3 = aux1;
						}else{
							aux3 = aux2;
						}	
					}
					//10
					aux1 = e00 - 2;
					aux2 = e01 - 0;
					if(aux1 <= aux2){
						aux5 = aux1;
					}else if (aux2 < aux1) {
						aux5 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux5 = aux1;
						}else{
							aux5 = aux2;
						}	
					}
					//00
					aux1 = e00 - 0;
					aux2 = e01 - 2;
					if(aux1 < aux2){
						aux6 = aux1;
					}else if (aux2 < aux1) {
						aux6 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux6 = aux1;
						}else{
							aux6 = aux2;
						}	
					}
					// transferencia do menor erro
					e11 = aux3;
					e01 = aux4;
	 				e10 = aux5;
	 				e00 = aux6;
	 			}else if (j == 0 && k == 1) {
				//01
					aux1 = e10 - 2;
					aux2 = e11 - 0;
					if(aux1 <= aux2){
						aux4 = aux1;
					}else if (aux2 < aux1) {
						aux4 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux4 = aux1;
						}else{
							aux4 = aux2;
						}	
					}
					//11
					aux1 = e10 - 0;
					aux2 = e11 - 2;
					if(aux1 <= aux2){
						aux3 = aux1;
					}else if (aux2 < aux1) {
						aux3 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux3 = aux1;
						}else{
							aux3 = aux2;
						}	
					}
					//10
					aux1 = e00 - 1;
					aux2 = e01 - 1;
					if(aux1 <= aux2){
						aux5 = aux1;
					}else if (aux2 < aux1) {
						aux5 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux5 = aux1;
						}else{
							aux5 = aux2;
						}	
					}
					//00
					aux1 = e00 - 1;
					aux2 = e01 - 1;
					if(aux1 <= aux2){
						aux6 = aux1;
					}else if (aux2 < aux1) {
						aux6 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux6 = aux1;
						}else{
							aux6 = aux2;
						}	
					}
					// transferencia do menor erro
					e11 = aux3;
					e01 = aux4;
	 				e10 = aux5;
	 				e00 = aux6;
	 			}else if (j == 1 && k == 0) {
					//01
					aux1 = e10 - 0;
					aux2 = e11 - 2;
					if(aux1 <= aux2){
						aux4 = aux1;
					}else if (aux2 < aux1) {
						aux4 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux4 = aux1;
						}else{
							aux4 = aux2;
						}	
					}
					//11
					aux1 = e10 - 2;
					aux2 = e11 - 0;
					if(aux1 <= aux2){
						aux3 = aux1;
					}else if (aux2 < aux1) {
						aux3 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux3 = aux1;
						}else{
							aux3 = aux2;
						}	
					}
					//10
					aux1 = e00 - 1;
					aux2 = e01 - 1;
					if(aux1 <= aux2){
						aux5 = aux1;
					}else if (aux2 < aux1) {
						aux5 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux5 = aux1;
						}else{
							aux5 = aux2;
						}	
					}
					//00
					aux1 = e00 - 1;
					aux2 = e01 - 1;
					if(aux1 <= aux2){
						aux6 = aux1;
					}else if (aux2 < aux1) {
						aux6 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux6 = aux1;
						}else{
							aux6 = aux2;
						}	
					}
					// transferencia do menor erro
					e11 = aux3;
					e01 = aux4;
	 				e10 = aux5;
	 				e00 = aux6;
	 			}else if (j == 1 && k == 1) {
				//01
					aux1 = e10 - 1;
					aux2 = e11 - 1;
					if(aux1 <= aux2){
						aux4 = aux1;
					}else if (aux2 < aux1) {
						aux4 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux4 = aux1;
						}else{
							aux4 = aux2;
						}	
					}
					//11
					aux1 = e10 - 1;
					aux2 = e11 - 1;
					if(aux1 <= aux2){
						aux3 = aux1;
					}else if (aux2 < aux1) {
						aux3 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux3 = aux1;
						}else{
							aux3 = aux2;
						}	
					}
					//10
					aux1 = e00 - 0;
					aux2 = e01 - 2;
					if(aux1 <= aux2){
						aux5 = aux1;
					}else if (aux2 < aux1) {
						aux5 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux5 = aux1;
						}else{
							aux5 = aux2;
						}	
					}
					//00
					aux1 = e00 - 2;
					aux2 = e01 - 0;
					if(aux1 <= aux2){
						aux6 = aux1;
					}else if (aux2 < aux1) {
						aux6 = aux2;
					}else{  
						a = radom.nextInt(100);
						if((a % 2) == 0){
							aux6 = aux1;
						}else{
							aux6 = aux2;
						}	
					}
					// transferencia do menor erro
					e11 = aux3;
					e01 = aux4;
	 				e10 = aux5;
	 				e00 = aux6;					e11 = e10 + 1;
					e01 = e10 + 1;
	 				e10 = e00 + 0;
	 				e00 = e00 + 2;
				}

				if(e00 <= e01 && e00 <= e10 &&e00 <= e11){
	 				bit.add(0);
	 			}else if (e01 <= e00 && e01 <= e10 &&e01 <= e11) {
	 				bit.add(0);
	 			}else if (e10 <= e00 && e10 <= e01 &&e10 <= e11) {
	 				bit.add(1);
	 			}else{
	 				bit.add(1);
	 			}


				System.out.println("Estado "+ ii +": "+ j + " " + k);
				ii++;
			}

			int m = bit.size();
			System.out.println(m);
			for(int n = bit.size(); n > 0; n--){
				j = bit.get(n-1);
				bits.add(j);
			}
			
			System.out.println("termino");

			return bit;
	}

}
