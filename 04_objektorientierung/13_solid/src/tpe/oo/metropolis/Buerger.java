package tpe.oo.metropolis;

public class Buerger extends Menschen implements Steuerpflichtig{

Buerger(String name, int einkommen) {
        super(name, einkommen);
        Finanzamt fa = Finanzamt.createFA();
        fa.addZahler((Steuerpflichtig) this);
    }



    public int zahleSteuern(){
        return Steuerberater.Betrag(this);
    }

}
