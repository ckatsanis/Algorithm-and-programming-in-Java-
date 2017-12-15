package erg83;

class ypallhlos {
    private int kodep;
    private int AM, oresY, ptyxio;
    private double bm;
    
    /*ypallhlos(int a, int b, int c, int d, double x) {
        kodep = a;
        AM = b;
        oresY = c;
        ptyxio = d;
        bm = x;
    }*/
    public void setypallhlos(int a, int b, int c, int d, double x) {
        kodep = a;
        AM = b;
        oresY = c;
        ptyxio = d;
        bm = x;
    }
    public int getypallhlosA() {
        
        return kodep;
    }
    public int getypallhlosB() {
        
        return AM;
    }
    public int getypallhlosC() {
        
        return oresY;
    }
    public int getypallhlosD() {
        
        return ptyxio;
    }
    public double getypallhlosX() {
        
        return bm;
    }

    public static void showtelikos(ypallhlos temp) {
        double sum;
        switch (temp.ptyxio ) {
            case 1: temp.ptyxio = 300;
                    break;
            case 2: temp.ptyxio = 150;
                    break;
            case 3: temp.ptyxio = 100;
                    break;
            case 4: temp.ptyxio = 50;
                    break;
            case 5: temp.ptyxio = 0;
                    break;
            case 6: temp.ptyxio = 0;
                    break;
            case 7: temp.ptyxio = 0;
                    break;
            default: System.out.println("To ptyxio poy kataxorhsate den yparxei.. Dokimaste ksana");
                     break;
        }
        sum = ( temp.bm + (20*temp.oresY) + temp.ptyxio);
        System.out.println("O Telikos misthos einai: " + sum);

    }
    public static double returntelikos(ypallhlos temp) {
        double sum;
        switch (temp.ptyxio ) {
            case 1: temp.ptyxio = 300;
                    break;
            case 2: temp.ptyxio = 150;
                    break;
            case 3: temp.ptyxio = 100;
                    break;
            case 4: temp.ptyxio = 50;
                    break;
            case 5: temp.ptyxio = 0;
                    break;
            case 6: temp.ptyxio = 0;
                    break;
            case 7: temp.ptyxio = 0;
                    break;
            default: System.out.println("To ptyxio poy kataxorhsate den yparxei.. Dokimaste ksana");
                     break;
        }
        sum = ( temp.bm + (20*temp.oresY) + temp.ptyxio);
        return sum;
    }
    
}