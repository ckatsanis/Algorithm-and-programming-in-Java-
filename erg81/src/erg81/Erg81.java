package erg81;

public class Erg81 {

    public static void showtelikos(int kp, int am, double bm, int yp, int ptyxio) {
        double sum;
        switch (ptyxio ) {
            case 1: ptyxio = 300;
                    break;
            case 2: ptyxio = 150;
                    break;
            case 3: ptyxio = 100;
                    break;
            case 4: ptyxio = 50;
                    break;
            case 5: ptyxio = 0;
                    break;
            case 6: ptyxio = 0;
                    break;
            case 7: ptyxio = 0;
                    break;
            default: System.out.println("To ptyxio poy kataxorhsate den yparxei.. Dokimaste ksana");
                     break;
        }
        sum = ( bm + (20*yp) + ptyxio);
        System.out.println("O Telikos misthos einai: " + sum);

    }
    public static double returntelikos(int kp, int am, double bm, int yp, int ptyxio) {
        double sum;
        switch (ptyxio ) {
            case 1: ptyxio = 300;
                    break;
            case 2: ptyxio = 150;
                    break;
            case 3: ptyxio = 100;
                    break;
            case 4: ptyxio = 50;
                    break;
            case 5: ptyxio = 0;
                    break;
            case 6: ptyxio = 0;
                    break;
            case 7: ptyxio = 0;
                    break;
            default: System.out.print("To ptyxio poy kataxorhsate den yparxei.. Dokimaste ksana");
                     break;
        }
        System.out.println();
        sum = ( bm + (20*yp) + ptyxio);
        return sum;
    }
    public static void main(String[] args) {
        ypallhlos yp1 = new ypallhlos();
        yp1.kodep = 1;
        yp1.AM = 100;
        yp1.bm = 1000;
        yp1.oresY = 2;
        yp1.ptyxio = 1;
        
        System.out.println("Kodikos Epeixhrhseis: " + yp1.kodep);
        System.out.println("AM: " + yp1.AM);
        System.out.println("Basikos Misthos: " + yp1.bm);
        System.out.println("Yperories: " + yp1.oresY);
        System.out.print("Ptyxio: ");
        switch (yp1.ptyxio ) {
            case 1: System.out.print(" Didaktoritko");
                    break;
            case 2: System.out.print(" Metaptixiako");
                    break;
            case 3: System.out.print(" AEI");
                    break;
            case 4: System.out.print(" IEK");
                    break;
            case 5: System.out.print(" Lykeio/Epal");
                    break;
            case 6: System.out.print(" Gymnasioy");
                    break;
            case 7: System.out.print(" Dhmotikou");
                    break;
            default: System.out.println("To ptyxio poy kataxorhsate den yparxei.. Dokimaste ksana");
                     break;
        }
        showtelikos(yp1.kodep, yp1.AM, yp1.bm, yp1.oresY, yp1.ptyxio);
        
        ypallhlos yp2 = new ypallhlos();
        yp2.kodep = 2;
        yp2.AM = 120;
        yp2.bm = 1600;
        yp2.oresY = 6;
        yp2.ptyxio = 2;
        
        System.out.println("Kodikos Epeixhrhseis: " + yp2.kodep);
        System.out.println("AM: " + yp2.AM);
        System.out.println("Basikos Misthos: " + yp2.bm);
        System.out.println("Yperories: " + yp2.oresY);
        System.out.print("Ptyxio: ");
        switch (yp2.ptyxio ) {
            case 1: System.out.print(" Didaktoritko");
                    break;
            case 2: System.out.print(" Metaptixiako");
                    break;
            case 3: System.out.print(" AEI");
                    break;
            case 4: System.out.print(" IEK");
                    break;
            case 5: System.out.print(" Lykeio/Epal");
                    break;
            case 6: System.out.print(" Gymnasioy");
                    break;
            case 7: System.out.print(" Dhmotikou");
                    break;
            default: System.out.print("To ptyxio poy kataxorhsate den yparxei.. Dokimaste ksana");
                     break;
        }
        System.out.println();
        System.out.println("O Telikos misthos tou deuterou ypallhloy einai: " + returntelikos(yp2.kodep, yp2.AM, yp2.bm, yp2.oresY, yp2.ptyxio) );
        
    }
    
}
