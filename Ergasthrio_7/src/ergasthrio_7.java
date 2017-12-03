
public class ergasthrio_7 {
/* Ergastirio 7
 * Xrhstos katsanhs 
 * AEM: 164814 
 * Examino: 5
 * Hmerominia: 22/11/17
 */
	
	//Dhlwsh Function
	public static int[] fill_pin(int n) {	// Fill table
		//vars
        int[] pin = new int[n];
        
        //fill table
        for ( int i = 0; i <= n - 1; i++) {
            pin[i] = (int) ( Math.random() * ( 10 - 0 ));
        }
        
        return pin;
    }
   
    public static void show_pin(int[] pin, int n, boolean swap) {   	// print table
    	if ( swap == true ) {
	        System.out.print("New Table: ");
	        for ( int i = 0; i <= n - 1; i++ ) {
	            System.out.print(pin[i]);
	        }
	        System.out.println();
    	}
    	else {
    		System.out.print("Table: ");
 	        for ( int i = 0; i <= n - 1; i++ ) {
 	            System.out.print(pin[i]);
 	        }
 	        System.out.println();
    	}
    }
   
    public static int[] find_max(int[] pin, int n) { 	// find max and pos
    	//vars
        int[] MaxP = { 0, 0 };
       
        //find max number with position
        for ( int i = 0; i <= n - 1; i++) {
            if ( pin[ i ] > MaxP[ 0 ] ) {
                MaxP[ 0 ] = pin[ i ];
                MaxP[ 1 ] = i;
            }
        }        
        return MaxP;  
    }
   
    public static int[] find_min(int[] pin, int n) {	// find min and pos
    	//vars
        int[] MinP = { 999, 0 };
       
        //find min number with position
        for ( int i = 0; i <= n - 1; i++) {
            if ( pin[ i ] < MinP[ 0 ] ) {
                MinP[ 0 ] = pin[ i ];
                MinP[ 1 ] = i;
            }
        }      
        
        return MinP;  
    }
   
    public static int[] swap_pin( int[] pin, int index) {	// swap table numbers with random math 
    	//Vars
        int temp;
        int pin1, pin2;
        pin1 = index;
        pin2 = (index + 1);
        
        //swaping with temp variable
        temp = pin[pin1];
        pin[pin1] = pin[pin2];
        pin[pin2] = temp;
       
        return pin;
    }
   
    public static void main(String[] args) { 	// main class 
    	//Set vars
        int n = 5;
        int[] pin = new int[ n ];
        int[] max = new int[ 2 ];
        int[] min = new int[ 2 ];
        int index;
        boolean Swap = false;
       
        //Call Functions
        pin = fill_pin( n );
        show_pin( pin, n, Swap);
        max = find_max(pin, n);
        min = find_min(pin, n);
       
        //Prints
        System.out.println("Max Number is: " + max[0] + " In Position: " + max[1]);
        System.out.println("Min Number is: " + min[0] + " In Position: " + min[1]);
       
        //swap and print
        index = (int) ( Math.random() * (3 - 0));
        System.out.println("Random Number is: pin" + '[' + index + ']' + " and pin" + '[' + (index + 1) + ']');
        pin = swap_pin( pin, index);
        Swap = true;
        show_pin(pin, n, Swap);
       
    }

}
/* Running
Table: 55754
Max Number is: 7 In Position: 2
Min Number is: 4 In Position: 4
Random Number is: pin[1] and pin[2]
New Table: 57554
*/