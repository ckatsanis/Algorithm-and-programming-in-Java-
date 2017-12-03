public class ergastirio_4 {

	/* Ergastirio 4
	 * Xrhstos katsanhs 
	 * AEM: 164814 
	 * Examino: 5
	 * Hmerominia: 7/11/17
	 */
	public static void main(String[] args) {
		
		//Set Variables
		double dPeis, dEaf, dEae, dFe, dAeiso, dFpa, dTP;
		int iAk;
		
		dPeis = 20000; //Poso eisodhmatos
		dEaf = 1000; //Ekptosh apo foro
		dEae = 3000; //Ekptosh apo eisodima
		dFe = 0; //Forologiteo eisodima
		dAeiso = 0; //Aforologito eisodima
		dFpa = 0; //Foros pou analogh
		dTP = 0; //Teliko Poso forou
		
		iAk = (int)(Math.random() * (5 - 0)); // Tixeos arithmos 0-4 gia ta akinita
		
		//Emfanhsh ton timon
		System.out.println("Εισόδημα: " + dPeis );
		System.out.println("Αριθμός Ακινήτων: " + iAk );
		System.out.println("Έκπτωση από Φόρο: " + dEaf );
		System.out.println("Έκπτωση από Εισόδημα: " + dEae );
		
		//Prakseis
		
		switch ( iAk )
		{
			
			case 0 : 	dAeiso = 12000;
						System.out.println("Αφορολόγητο Εισόδημα: " + dAeiso );
						break;
			case 1 : 	dAeiso = 10000;
						System.out.println("Αφορολόγητο Εισόδημα: " + dAeiso );
						break;
			case 2 : 	dAeiso = 8000;
						System.out.println("Αφορολόγητο Εισόδημα: " + dAeiso );
						break;
			case 3 : 	dAeiso = 5000;
						System.out.println("Αφορολόγητο Εισόδημα: " + dAeiso );
						break;
			case 4 :	dAeiso = 0;
						System.out.println("Αφορολόγητο Εισόδημα: " + dAeiso );
						break;
			default :   System.out.println("Unknow Number Try Run again!!");
						break;
		}
		dFe = dPeis - dEae - dAeiso;
		System.out.println("Φορολογητέο Εισόδημα: " + dFe );
		dFpa = dFe * 30/100;
		dTP = dFpa - dEaf;
		
		System.out.println("Φόρος που αναλογεί: " + dFpa);
		System.out.println("Τελικό Ποσό Φόρου: " + dTP);
	}

}
/*Eksodos
 * Εισόδημα: 20000.0
 * Αριθμός Ακινήτων: 0
 * Έκπτωση από Φόρο: 1000.0
 * Έκπτωση από Εισόδημα: 3000.0
 * Αφορολόγητο Εισόδημα: 12000.0
 * Φορολογητέο Εισόδημα: 5000.0
 * Φόρος που αναλογεί: 1500.0
 * Τελικό Ποσό Φόρου: 500.0
 * 
 * Εισόδημα: 20000.0
Αριθμός Ακινήτων: 1
Έκπτωση από Φόρο: 1000.0
Έκπτωση από Εισόδημα: 3000.0
Αφορολόγητο Εισόδημα: 10000.0
Φορολογητέο Εισόδημα: 7000.0
Φόρος που αναλογεί: 2100.0
Τελικό Ποσό Φόρου: 1100.0
 * 
 * Εισόδημα: 20000.0
Αριθμός Ακινήτων: 2
Έκπτωση από Φόρο: 1000.0
Έκπτωση από Εισόδημα: 3000.0
Αφορολόγητο Εισόδημα: 8000.0
Φορολογητέο Εισόδημα: 9000.0
Φόρος που αναλογεί: 2700.0
Τελικό Ποσό Φόρου: 1700.0

Εισόδημα: 20000.0
Αριθμός Ακινήτων: 3
Έκπτωση από Φόρο: 1000.0
Έκπτωση από Εισόδημα: 3000.0
Αφορολόγητο Εισόδημα: 5000.0
Φορολογητέο Εισόδημα: 12000.0
Φόρος που αναλογεί: 3600.0
Τελικό Ποσό Φόρου: 2600.0

Εισόδημα: 20000.0
Αριθμός Ακινήτων: 4
Έκπτωση από Φόρο: 1000.0
Έκπτωση από Εισόδημα: 3000.0
Αφορολόγητο Εισόδημα: 0.0
Φορολογητέο Εισόδημα: 17000.0
Φόρος που αναλογεί: 5100.0
Τελικό Ποσό Φόρου: 4100.0

 */
