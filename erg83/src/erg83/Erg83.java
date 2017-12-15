package erg83;

public class Erg83 {
        
    public static void main(String[] args) {
        ypallhlos yp1 = new ypallhlos();
        ypallhlos yp2 = new ypallhlos();
        
        yp1.setypallhlos(100, 150, 5, 1, 1600.0);
        yp2.setypallhlos(100, 152, 6, 2, 1300.0);
        
        System.out.println("Kodikos Epeixhrhseis: " + yp1.getypallhlosA());
        System.out.println("AM: " + yp1.getypallhlosB());
        System.out.println("Basikos Misthos: " + yp1.getypallhlosX());
        System.out.println("Yperories: " + yp1.getypallhlosC());
        System.out.print("Ptyxio: ");
        switch (yp1.getypallhlosD() ) {
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
        ypallhlos.showtelikos(yp1);
                
        System.out.println("Kodikos Epeixhrhseis: " + yp2.getypallhlosA());
        System.out.println("AM: " + yp2.getypallhlosB());
        System.out.println("Basikos Misthos: " + yp2.getypallhlosX());
        System.out.println("Yperories: " + yp2.getypallhlosC());
        System.out.print("Ptyxio: ");
        switch (yp2.getypallhlosD() ) {
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
        System.out.println("O Telikos misthos tou deuterou ypallhloy einai: " + ypallhlos.returntelikos(yp2) );
        
    }
    
}
