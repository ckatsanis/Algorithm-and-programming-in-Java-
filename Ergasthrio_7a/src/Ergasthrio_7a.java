
public class Ergasthrio_7a {
/* Ergastirio 7
 * Xrhstos katsanhs 
 * AEM: 164814 
 * Examino: 5
 * Hmerominia: 22/11/17
 */
	
	//Dhlwsh Function
	public static int[][] fill_pin() {	// Fill table
		//vars
        int[][] pin = new int[20][20];
        
        //fill table

	    for ( int i = 0; i <= pin.length - 1; i++) {
	        for ( int j = 0; j <= pin.length - 1; j++){
	            pin[i][j] = (int) ( Math.random() * ( 100 - 10 ));
	        }
	    }
        
        return pin;
    }
   
    public static void show_pin(int[][] pin) {   	// print table
    	System.out.print("Table: ");
 	    for ( int i = 0; i <= pin.length - 1; i++ ) {
	 	    for ( int j = 0; j <= pin.length - 1; j++) {
	 	    	System.out.print(pin[i][j]+ " ");
	 	    }
	 	    System.out.println();
 	    }
 	    System.out.println();
    }
   
    public static int findDath(int[][] pin) { // Diagonios
    	int sum = 0;
    	int temp = 0;
    	for ( int i = 0; i <= pin.length - 1;i++) {
    		sum += pin[temp][i];
    		temp++;
    	}
    	temp = 19;
    	for ( int i = 0; i <= pin.length - 1;i++) {
    		sum += pin[temp][i];
    		temp--;
    	}
    		
    	return sum;
    }
    
    public static int[] findmo(int[][] pin) { // Mesos oros
    	int[] mo = new int[ 20 ];
    	for ( int i = 0; i <= pin.length - 1; i++)
    		for ( int j = 0; j <= pin.length - 1; j++) {
    			mo[i] = (mo[i] + pin[i][j]);
    		}
    	for (int i = 0; i <= mo.length - 1; i++)
    		mo[i] = mo[i]/2;
    		
    	return mo;
    }
    
    public static void main(String[] args) { 	// main class 
    	//Set vars
        int[][] pin = new int[ 20 ][ 20 ];
        int[] mo = new int[ 20 ];
        int sum = 0;
        
        //Call Functions
        pin = fill_pin();
        show_pin( pin);
        mo = findmo(pin);
        //mo
        for ( int i = 0; i <= mo.length - 1; i++)
        	System.out.println("Mesos oros ths sthlhs p[" + i + "]" + " einai: " + mo[i]);
        System.out.println("To athrisma ton diagonion einai: " + findDath(pin));
        //Sum
        sum = findDath(pin);
        System.out.println("Sum is: " + sum);
    }

}
/* Running
Table: 15 0 69 10 10 51 35 42 73 47 85 71 69 26 38 47 70 30 59 7 
43 37 9 85 63 57 84 18 66 23 24 59 46 21 56 5 17 40 77 41 
47 30 83 58 16 81 35 50 56 74 70 35 71 65 82 5 43 43 52 81 
53 69 3 1 88 9 72 17 1 71 87 19 17 43 61 28 32 27 60 83 
53 51 6 86 66 68 21 83 42 39 89 49 41 42 44 77 58 77 46 66 
62 50 29 60 79 43 9 32 25 70 86 46 66 89 45 40 34 80 50 53 
62 81 61 51 75 18 70 61 66 49 54 69 75 19 85 31 71 56 63 85 
7 46 16 11 65 40 37 13 48 46 56 15 72 38 7 43 56 46 49 2 
58 70 11 32 13 18 89 66 29 34 26 36 52 63 20 27 0 8 27 17 
40 56 20 16 25 19 34 57 72 75 78 43 17 71 25 69 10 74 56 78 
34 79 84 7 16 83 78 44 7 5 75 81 58 75 19 31 74 76 51 19 
39 5 28 84 3 65 44 7 9 25 19 10 82 76 15 49 81 70 5 37 
21 76 5 49 10 46 72 43 7 19 72 40 77 21 27 13 46 11 75 87 
52 88 65 26 66 60 34 73 70 70 30 69 31 1 88 18 63 21 13 67 
50 70 83 7 15 51 65 39 50 67 58 64 60 10 37 1 52 66 54 5 
33 38 58 4 1 3 22 88 66 46 6 5 70 89 30 14 79 65 69 69 
1 54 38 51 80 40 64 17 36 3 31 40 59 56 20 65 80 45 20 33 
86 59 13 74 69 7 3 89 86 24 4 88 6 19 85 22 23 38 36 86 
83 89 83 18 11 29 78 58 34 46 19 89 60 3 89 81 60 87 85 32 
87 42 84 29 0 14 61 66 39 39 4 62 41 51 69 5 5 29 38 58 

Mesos oros ths sthlhs p[0] einai: 427
Mesos oros ths sthlhs p[1] einai: 435
Mesos oros ths sthlhs p[2] einai: 538
Mesos oros ths sthlhs p[3] einai: 420
Mesos oros ths sthlhs p[4] einai: 552
Mesos oros ths sthlhs p[5] einai: 524
Mesos oros ths sthlhs p[6] einai: 601
Mesos oros ths sthlhs p[7] einai: 356
Mesos oros ths sthlhs p[8] einai: 348
Mesos oros ths sthlhs p[9] einai: 467
Mesos oros ths sthlhs p[10] einai: 498
Mesos oros ths sthlhs p[11] einai: 376
Mesos oros ths sthlhs p[12] einai: 408
Mesos oros ths sthlhs p[13] einai: 502
Mesos oros ths sthlhs p[14] einai: 452
Mesos oros ths sthlhs p[15] einai: 427
Mesos oros ths sthlhs p[16] einai: 416
Mesos oros ths sthlhs p[17] einai: 458
Mesos oros ths sthlhs p[18] einai: 567
Mesos oros ths sthlhs p[19] einai: 411
To athrisma ton diagonion einai: 1776
Sum is: 1776
*/