package tpe.oo.metropolis;

public class Metropolis {

    public static void main(String[] args) {
        Finanzamt fm = new Finanzamt();
        Einwohner[] einarr = new Einwohner[10];
        int temp=0;
        einarr[temp++] = new Schurken("Magneto","Metal manipulation", 10000);
        fm.addZahler((Streuerpflichtig) einarr[0],1);
        System.out.println(fm.steuernausgeben());
    }

}
