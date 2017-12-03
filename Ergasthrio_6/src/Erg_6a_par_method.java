
public class Erg_6a_par_method {

    
    static int parag(int n){
      int par = 1;
      for (int i = 1;i <= n;i++){ 
          par *= i;
    //  System.out.println(par); 
      }
      return par;
    }
    
    public static void main(String[] args) {
        int n;
        n = (int) ( Math.random()*10);
        System.out.println("n = " + n );
         
        // Ξ�Ξ»Ξ®ΟƒΞ· ΞΌΞµΞΈΟ�Ξ΄ΞΏΟ… Ξ¥Ο€ΞΏΞ»ΞΏΞ³ΞΉΟƒΞΌΞΏΟ� n! 
        System.out.println("Ξ¤ΞΏ Ο€Ξ±Ο�Ξ±Ξ³ΞΏΞ½Ο„ΞΉΞΊΟ� Ο„ΞΏΟ… " + n + " ΞµΞ―Ξ½Ξ±ΞΉ : " + parag(n) ); 
    
        }
}

/* Ξ¤Ο�Ξ­ΞΎΞΉΞΌΞΏ Ξ Ο�ΞΏΞ³Ο�Ξ¬ΞΌΞΌΞ±Ο„ΞΏΟ‚

run:
n = 8
Ξ¤ΞΏ Ο€Ξ±Ο�Ξ±Ξ³ΞΏΞ½Ο„ΞΉΞΊΟ� Ο„ΞΏΟ… 8 ΞµΞ―Ξ½Ξ±ΞΉ : 40320
BUILD SUCCESSFUL (total time: 0 seconds)

run:
n = 1
Ξ¤ΞΏ Ο€Ξ±Ο�Ξ±Ξ³ΞΏΞ½Ο„ΞΉΞΊΟ� Ο„ΞΏΟ… 1 ΞµΞ―Ξ½Ξ±ΞΉ : 1
BUILD SUCCESSFUL (total time: 0 seconds)

run:
n = 0
Ξ¤ΞΏ Ο€Ξ±Ο�Ξ±Ξ³ΞΏΞ½Ο„ΞΉΞΊΟ� Ο„ΞΏΟ… 0 ΞµΞ―Ξ½Ξ±ΞΉ : 1
BUILD SUCCESSFUL (total time: 0 seconds)
*/

