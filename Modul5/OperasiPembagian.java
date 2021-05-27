package Modul5;

class OperasiPembagian extends OperasiBilanganAbs {

    @Override
    protected void setA(double a) {
         this.a = a;
     }

    @Override
    protected void setB(double b) {
         this.b = b;
     }

    @Override
    protected void setC() {

     }

    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected double getC() {
        return a/b;
    }
    
    @Override
    protected void tampil(){
        System.out.println("    Pembagian ");
        System.out.println("----------------------");
        System.out.println("A : B = " + this.getC());
        System.out.println("----------------------\n");
    }
    
    
}
