
public class Ergasthrio_5 {
	/* Ergastirio 5
	 * Xrhstos katsanhs 
	 * AEM: 164814 
	 * Examino: 5
	 * Hmerominia: 7/11/17
	 */
	public static void main(String[] args) {
		//Vars
		int iTa;
		double dTd, dEtd;
		
		//Var Sets
		iTa = (int)(Math.random() * (10 - 0)); // Random Number
		dTd = 0; // Arxikh timh
		dEtd = 0; // Ypologismos epomenhs timhs
		
		//Praxeis kai Emfaniseis
		System.out.println("Random Number is: " + iTa);
		
		while ( (iTa <= 2 ) && ( iTa >= 7 ) )
		{
			iTa = (int)(Math.random() * (10 - 0));
			System.out.println("New Random Number is: " + iTa);
		}
		
		dTd = iTa;
		
		while ( 100 > dTd)
		{
			dEtd = ( dEtd * dTd );
			System.out.println("Νεα Τιμή δύναμης: " + dEtd);		
		}

	}

}
