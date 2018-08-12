public class NombreNumero {
	
	public String Nombre (int n) {
		
		String Nom;
		
		if (n>=0 && n<=20) {
			Nom = this.num20(n);
		} 
		else if (n>20 && n<100) {
			
			Nom = this.num100(n);
		}
		else {
			Nom = "Número muy grande.";
		}
		
		return Nom;
	}
	
		public String mult (int n) {
			
			String r = "";
			
			if (n%10 == 0) {
				r = "";
			}
			else {
				r = " Y "+this.num20(n%10);				
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

}
