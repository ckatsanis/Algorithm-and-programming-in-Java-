package erg82;

class ypallhlos {
    int kodep, AM, oresY, ptyxio;
    double bm;
    
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
            default: System.out.println("To ptyxio poy kataxorhsate den yparxei.. Dokimaste ksana");
                     break;
        }
        sum = ( bm + (20*yp) + ptyxio);
        return sum;
    }
    
}