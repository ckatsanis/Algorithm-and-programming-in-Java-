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
		System.out.println("��������: " + dPeis );
		System.out.println("������� ��������: " + iAk );
		System.out.println("������� ��� ����: " + dEaf );
		System.out.println("������� ��� ��������: " + dEae );
		
		//Prakseis
		
		switch ( iAk )
		{
			
			case 0 : 	dAeiso = 12000;
						System.out.println("����������� ��������: " + dAeiso );
						break;
			case 1 : 	dAeiso = 10000;
						System.out.println("����������� ��������: " + dAeiso );
						break;
			case 2 : 	dAeiso = 8000;
						System.out.println("����������� ��������: " + dAeiso );
						break;
			case 3 : 	dAeiso = 5000;
						System.out.println("����������� ��������: " + dAeiso );
						break;
			case 4 :	dAeiso = 0;
						System.out.println("����������� ��������: " + dAeiso );
						break;
			default :   System.out.println("Unknow Number Try Run again!!");
						break;
		}
		dFe = dPeis - dEae - dAeiso;
		System.out.println("����������� ��������: " + dFe );
		dFpa = dFe * 30/100;
		dTP = dFpa - dEaf;
		
		System.out.println("����� ��� ��������: " + dFpa);
		System.out.println("������ ���� �����: " + dTP);
	}

}
/*Eksodos
 * ��������: 20000.0
 * ������� ��������: 0
 * ������� ��� ����: 1000.0
 * ������� ��� ��������: 3000.0
 * ����������� ��������: 12000.0
 * ����������� ��������: 5000.0
 * ����� ��� ��������: 1500.0
 * ������ ���� �����: 500.0
 * 
 * ��������: 20000.0
������� ��������: 1
������� ��� ����: 1000.0
������� ��� ��������: 3000.0
����������� ��������: 10000.0
����������� ��������: 7000.0
����� ��� ��������: 2100.0
������ ���� �����: 1100.0
 * 
 * ��������: 20000.0
������� ��������: 2
������� ��� ����: 1000.0
������� ��� ��������: 3000.0
����������� ��������: 8000.0
����������� ��������: 9000.0
����� ��� ��������: 2700.0
������ ���� �����: 1700.0

��������: 20000.0
������� ��������: 3
������� ��� ����: 1000.0
������� ��� ��������: 3000.0
����������� ��������: 5000.0
����������� ��������: 12000.0
����� ��� ��������: 3600.0
������ ���� �����: 2600.0

��������: 20000.0
������� ��������: 4
������� ��� ����: 1000.0
������� ��� ��������: 3000.0
����������� ��������: 0.0
����������� ��������: 17000.0
����� ��� ��������: 5100.0
������ ���� �����: 4100.0

 */
