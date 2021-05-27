package Modul5;

final class OperasiBilanganAbsCetak {

    public static void main(String[] args) {
        int i;
        
        OperasiBilanganAbs[] OB = new OperasiBilanganAbs[4];
        OB[0] = new OperasiPenjumlahan();
        OB[1] = new OperasiPengurangan();
        OB[2] = new OperasiPerkalian();
        OB[3] = new OperasiPembagian();
        
        
        
        for (i=0 ; i<OB.length ; i++){
            OB[i].setA(10.5);
            OB[i].setB(0.5);
            OB[i].tampil();
            
        }
    }
    
}
