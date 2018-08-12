public class NombreNumero {
	
	public String Nombre (int n) {
		
		String Nom;
		
		if (n>=0 && n<=20) {
			Nom = this.num20(n);
		} 
		else if (n>20 && n<100) {
			
			Nom = this.num100(n);
		}
		else if (n>=100 && n<1000) {
			Nom = this.num1000(n);
		}
		else {
			Nom = "Número muy grande.";
		}
		
		return Nom;
	}
	
		public String mult (int n) {
			
			String r = "";
			
			if (n>20 && n<100 && n%10 == 0) {
				r = "";
			}
			else if (n>20 && n<100) {
				r = " Y "+this.num20(n%10);				
			}
			else if (n>=100 && n<1000 && n%100 == 0) {
				r = "";				
			}
			else {
				r = " "+this.num100(n%100);
			}
			return r;
		}
	
		public String num20 (int n) {
				
			String r = "";
			
			switch (n) {
			
				case 0:
					
					r = "CERO";
					break;
					
				case 1:
					
					r = "UNO";
					break; 
					
				case 2:
					r = "DOS";
					break; 
				case 3:
					r = "TRES";
					break; 
				case 4:
					r = "CUATRO";
					break; 
				case 5:
					r = "CINCO";
					break; 
				case 6:
					r = "SEIS";
					break; 
				case 7:
					r = "SIETE";
					break; 
				case 8:
					r = "OCHO";
					break; 
				case 9:
					r = "NUEVE";
					break; 
				case 10:
					r = "DIEZ";
					break; 
				case 11:
					r = "ONCE";
					break; 
				case 12:
					r = "DOCE";
					break; 
				case 13:
					r = "TRECE";
					break; 
				case 14:
					r = "CATORCE";
					break; 
				case 15:
					r = "QUINCE";
					break; 
				case 16:
					r = "DIECISEIS";
					break; 
				case 17:
					r = "DIECISIETE";
					break; 
				case 18:
					r = "DIECIOCHO";
					break; 
				case 19:
					r = "DIECINUEVE";
					break; 
				case 20:
					r = "VEINTE";
					break; 
				default: break;
			}
			
			return r;
				
		}
		
		public String num100 (int n) {
			
			String r = "";
			
			int m = n-(n%10);
			
			switch (m) {
			
			case 20: 
				r = "VEINTI"+mult(n); 
				break;
			case 30: 
				r = "TREINTA"+mult(n); 
				break;
			case 40: 
				r = "CUARENTA"+mult(n); 
				break;
			case 50: 
				r = "CINCUENTA"+mult(n); 
				break;
			case 60: 
				r = "SESENTA"+mult(n); 
				break;
			case 70: 
				r = "SETENTA"+mult(n); 
				break;
			case 80: 
				r = "OCHENTA"+mult(n); 
				break;
			case 90: 
				r = "NOVENTA"+mult(n); 
				break;
			default: break;
			
			}
			
			return r;
			
		}
		
		public String num1000 (int n) {
			
			String r = "";
			
			int m = n -(n%100);
			
			if (n == 100) {
				r = "CIEN";
			}
			else {
				
				switch (m) {
				
				case 100: 
					r = "CIENTO"+mult(n);
					break;
				case 200: 
					r = "DOCIENTOS"+mult(n);
					break;
				case 300: 
					r = "TRESCIENTOS"+mult(n);
					break;
				case 400: 
					r = "CUATROCIENTOS"+mult(n);
					break;
				case 500: 
					r = "QUINIENTOS"+mult(n);
					break;
				case 600: 
					r = "SEICIENTOS"+mult(n);
					break;
				case 700: 
					r = "SETECIENTOS"+mult(n);
					break;
				case 800: 
					r = "OCHOCIENTOS"+mult(n);
					break;
				case 900: 
					r = "NOVECIENTOS"+mult(n);
					break;
				default: break;
				
				}
				
			}
			
			return r;
		}
}
