package tpe.oo.metropolis;

public class Buerger extends Menschen implements Streuerpflichtig{

Buerger(String name, int einkommen) {
        super(name, einkommen);
    }



    public int zahleSteuern(){
        return 0;
    }

}
