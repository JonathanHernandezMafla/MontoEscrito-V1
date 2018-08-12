public class NombreNumero {
	
	public String Nombre (int n) {
		
		String Nom;
		
		if (n>=0 && n<=20) {
			Nom = this.num20(n);
		} 
		else {
			
			Nom = "Falta";
		}
		
		return Nom;
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

}
